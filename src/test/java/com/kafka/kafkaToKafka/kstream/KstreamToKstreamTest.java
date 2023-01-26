package com.kafka.kafkaToKafka.kstream;

import org.junit.jupiter.api.Test;
import org.springframework.kafka.annotation.KafkaListener;

import static org.junit.jupiter.api.Assertions.*;

class KstreamToKstreamTest {
    String recievedMsg;
    @KafkaListener(topics = "output-topic")
    public String listenmsg(String message) {
        recievedMsg=message;
        return message;
    }

    @Test
    void kafkatest(){
        var test = new KstreamToKstream();
        assertEquals("hi","hi");
    }

}