package com.exquilla.kafkaExample;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.Properties;

class sampleConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props= new Properties();
	       props.put("bootstrap.servers", "localhost:9092");
	       props.put("group.id","test-group");
	       
	       
	       kafkaConsumer<String,String>consumer = new kafkaConsumer<>
	       

	}

}
