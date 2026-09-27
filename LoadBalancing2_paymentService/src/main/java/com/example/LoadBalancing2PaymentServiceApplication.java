package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadBalancing2PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancing2PaymentServiceApplication.class, args);
	}

}


// Open 3 terminals from project root and run 3 instances as : 

// mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8081"

// mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8082"

// mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8083"