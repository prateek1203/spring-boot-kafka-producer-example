package com.example.springbootkafkaproducerexample;

import com.example.springbootkafkaproducerexample.controller.KafkaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootKafkaProducerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaProducerExampleApplication.class, args);
	}

}
