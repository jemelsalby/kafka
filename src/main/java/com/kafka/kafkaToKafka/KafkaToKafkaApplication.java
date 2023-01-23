package com.kafka.kafkaToKafka;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;
@SpringBootApplication
public class KafkaToKafkaApplication {
	public static void main(String[] args) {
		Properties config = new Properties();
		config.put(StreamsConfig.APPLICATION_ID_CONFIG, "kafka-streams-demo");
		config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		StreamsBuilder builder = new StreamsBuilder();
		builder.stream("input-topic").to("output-topic");
		KafkaStreams streams = new KafkaStreams(builder.build(), config);
		streams.start();
		SpringApplication.run(KafkaToKafkaApplication.class, args);
	}
}


