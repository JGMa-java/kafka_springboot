package com.hzqsy.recognition.task;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hzqsy.recognition.pojo.User;
import com.hzqsy.recognition.util.Contants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created By admin on 2019.11.18
 */
@Component
public class UserTask {
    @Value("${dps.recognition.kafka.topic}")
    private String topicName;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    //@Scheduled(fixedRate = 5 * 1000)
//    public void addUserTask() {
//        User user=new User();
//        user.setUserName("HS");
//        user.setDescription("text");
//        user.setCreateTime(LocalDateTime.now());
//        String jsonuser = JSON.toJSONStringWithDateFormat(user,
//                Contants.DateTimeFormat.DATE_TIME_PATTERN,//日期格式化
//                SerializerFeature.PrettyFormat);//格式化json
//        for (int i = 0; i < 700; i++) {
//            kafkaTemplate.send(topicName,jsonuser);
//        }
//    }
}
