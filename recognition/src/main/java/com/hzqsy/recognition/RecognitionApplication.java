package com.hzqsy.recognition;

import com.alibaba.fastjson.JSON;
import com.hzqsy.recognition.util.Contants;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@MapperScan("com.hzqsy.recognition.dao")
public class RecognitionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RecognitionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        JSON.DEFFAULT_DATE_FORMAT= Contants.DateTimeFormat.DATE_TIME_PATTERN;
    }
}
