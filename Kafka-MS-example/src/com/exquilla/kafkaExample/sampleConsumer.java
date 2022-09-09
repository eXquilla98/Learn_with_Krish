package com.exquilla.kafkaExample;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
@Service
class sampleConsumer {

	
		
			
			public static final Logger LOGGER = LoggerFactory.getLogger(sampleConsumer.class);
			
			@KafkaListener(topics = "demo", groupId ="myGroup")
			public void consume(String message) {
				LOGGER.info(String.format("Message received -> %s ", message));
			}
	    	
	    	   
			
			
		}
	       
	       

	


