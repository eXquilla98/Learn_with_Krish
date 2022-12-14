package com.exquilla.kafkaExample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkasample.Kafka.KafkaProducer;

@RestController
@RequestMapping("api/v1/kafka")
public class MessageController {
	
	private KafkaProducer kafkaProducer;

	@Autowired
	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message){
		kafkaProducer.sendMesage(message);
		return ResponseEntity.ok("message sent to the topic");
	}
	
	

}