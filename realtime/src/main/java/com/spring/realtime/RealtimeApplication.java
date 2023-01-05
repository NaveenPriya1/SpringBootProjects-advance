package com.spring.realtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inventory.entities.Sales;

@SpringBootApplication
public class RealtimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealtimeApplication.class, args);
	

	}
	
	@Bean
	public Sales getSales() {
		return new Sales();
	}

}
