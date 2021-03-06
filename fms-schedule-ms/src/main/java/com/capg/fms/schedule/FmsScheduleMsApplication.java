package com.capg.fms.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FmsScheduleMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FmsScheduleMsApplication.class, args);
	}

}
