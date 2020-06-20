package com.verizon.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.kafka.publisher.KafkaPublisher;

@RestController
public class KafkaController {
	
	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
	
	@Autowired
	private KafkaPublisher kafkaPublisher;

	@GetMapping("/publishMessage")
	public String publishMessage(@RequestParam(value = "message") String message) {
		logger.info("In Kafka Publisher publishng message {}",message);
		kafkaPublisher.sendMessage(message);
		return "sucess";
	}
	
}
