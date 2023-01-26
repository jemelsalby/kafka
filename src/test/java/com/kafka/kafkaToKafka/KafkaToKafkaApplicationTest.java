package com.kafka.kafkaToKafka;

import com.kafka.kafkaToKafka.kstream.KstreamToKstream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class KafkaToKafkaApplicationTest {
	@Mock
	private KstreamToKstream kstream;

	@Test
	public void testMain() {
		KafkaToKafkaApplication.main(new String[0]);
		verify(kstream).processing();
	}
}
