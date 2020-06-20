package com.verizon.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VzKafkaPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(VzKafkaPublisherApplication.class, args);
	}

}