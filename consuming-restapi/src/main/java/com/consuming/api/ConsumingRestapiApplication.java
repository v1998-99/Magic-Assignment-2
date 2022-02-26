package com.consuming.api;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class ConsumingRestapiApplication {

	//private static final Logger log = LoggerFactory.getLogger(ConsumingRestapiApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestapiApplication.class, args);
	}
	
	//@Bean
	//public RestTemplate restTemplate(RestTemplateBuilder builder) {
	//	return builder.build();
	//}
	
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			OuterStatus outerstatus = restTemplate.getForObject(
//					"http://dummy.restapiexample.com/api/v1/employee/1", OuterStatus.class);
//			log.info(outerstatus.toString());
//		};
	}

//}
