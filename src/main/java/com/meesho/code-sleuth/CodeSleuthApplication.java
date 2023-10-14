package com.meesho;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

@SpringBootApplication(exclude = {KafkaAutoConfiguration.class, DataSourceAutoConfiguration.class}, scanBasePackages = {
        "com.meesho"})
@Slf4j
public class CodeSleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeSleuthApplication.class, args);
    }
}