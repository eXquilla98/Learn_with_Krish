package com.exquilla.kafkaExample;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Service;
@Service
class smapleProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(sampleProducer.class);
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public sampleProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMesage(String message) {
		LOGGER.info(String.format("Message sent %s", message));
		kafkaTemplate.send("demo", message);
	}
	
}
	


