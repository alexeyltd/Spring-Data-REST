package com.example.eventmanagementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan(basePackageClasses = {EventmanagementApiApplication.class, Jsr310Converters.class})
public class EventmanagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmanagementApiApplication.class, args);
	}
}
