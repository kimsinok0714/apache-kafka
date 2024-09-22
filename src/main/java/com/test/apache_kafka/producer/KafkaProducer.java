package com.test.apache_kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.test.apache_kafka.utils.AppConstants;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    public void sendMessage(String message) {
        log.info("Message sent -> {}", message);
        kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
    }

}
