package com.test.apache_kafka.consumer;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;
import com.test.apache_kafka.utils.AppConstants;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = AppConstants.TOPIC_NAME,
                    groupId = AppConstants.GROUP_ID)
    public void consume(String message){
        log.info("Message received -> {}", message);
        
    }
}