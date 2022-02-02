package com.github.wesleyav.graphqlspringbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class GraphqlSpringBootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlSpringBootSampleApplication.class, args);
	}

}
