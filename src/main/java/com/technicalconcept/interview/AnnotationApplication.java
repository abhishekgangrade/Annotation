package com.technicalconcept.interview;

import com.technicalconcept.interview.service.Faculty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.technicalconcept.interview.service;")
public class AnnotationApplication {

	public static void main(String[] args) {

		SpringApplication.run(AnnotationApplication.class, args);
	}

	@Bean
	public Faculty faculty(){
		return  new Faculty();
	}

}
