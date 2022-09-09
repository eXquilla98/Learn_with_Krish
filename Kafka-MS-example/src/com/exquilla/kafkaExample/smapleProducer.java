package com.exquilla.kafkaExample;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

class smapleProducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Properties props= new Properties();
       props.put("bootstrap.servers", "localhost:9092");
       props.put("key.serializer","org.apache.kafka.common.serialization.IntegerSerializer" );
       props.put("valu.Serializer", "org.apache.kafka.common.serialization.StringSerializer");
       
       
       Producer<Integer,String> producer= new KafkaProducer<Integer,String>(props);
       producer.initTransactions();
    
    	  
    	  for (int i = 0; i < 20; i++) {
   	   ProducerRecord<Integer,String>producerRecord = new ProducerRecord<Integer,String>("exquilla",i,"Test Message # "+Integer.toString(i));
   	   producer.send(producerRecord);}
   	   
     
    		
	   producer.close();
    	   
    	  
		
      }
	
}
	


