package com.kafka.kafkaToKafka;

import com.kafka.kafkaToKafka.kstream.KstreamToKstream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaToKafkaApplication {

	public static void main(String[] args) {
		KstreamToKstream kstream= new KstreamToKstream();
		kstream.processing();
		SpringApplication.run(KafkaToKafkaApplication.class, args);

	}
}


