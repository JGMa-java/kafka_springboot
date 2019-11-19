package com.hzqsy.recognition.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hzqsy.recognition.dao.UserMapper;
import com.hzqsy.recognition.pojo.*;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created By admin on 2019.11.12
 */
@RestController
public class KafkaCtrl {
    private Logger log = LoggerFactory.getLogger(KafkaCtrl.class);

//    @Autowired
//    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private UserMapper userMapper;

    @Value("${elastic.indexName}")
    private String indexName;

    @Value("${elastic.indexType}")
    private String indexType;

    @Value("${dps.recognition.kafka.topic}")
    private String topicName;

    @GetMapping("/send")
    public String send() {
        try {
            int i = 0;
            while (i < 500) {
                kafkaTemplate.send(topicName, "123123");
                i++;
            }
            return topicName;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("发送kafka失败：{}", e);
            return "error";
        }
    }

//    @KafkaListener(groupId = "${dps.recognition.kafka.groupid}", topicPartitions = {
//            @TopicPartition(topic = "${dps.recognition.kafka.topic}", partitions = "${dps.recognition.kafka.partition}")})
//    @KafkaListener(containerFactory = "kafkaBatchListener6",topics = {"#{'${kafka.listener.topics}'.split(',')[0]}"})
    @KafkaListener(groupId = "${dps.recognition.kafka.groupid}",containerFactory = "kafkaBatchListener6",topics = {"${dps.recognition.kafka.topic}"})
    public void listenRecognition(List<ConsumerRecord<String, String>> records, Acknowledgment ack) {
        boolean status = true;
        int size = records.size();

        List<User> users = new ArrayList<>();
        for (ConsumerRecord<String, String> record : records) {
            String value = record.value();
            User user = JSON.parseObject(value, User.class);
            users.add(user);
        }
        try {
            userMapper.batchInsert(users);
            ack.acknowledge();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("接收消息 {} 条.", size);
    }

}
