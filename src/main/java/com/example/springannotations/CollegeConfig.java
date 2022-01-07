package com.example.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.springannotations")
public class CollegeConfig {

	@Bean
	public Dean deanBean(){
		return new Dean();
	}

	@Bean
	public Professor mathProfessorBean(){
		return new MathProfessor();
	}

	@Bean
	public College collegeBean(){
		return new College();
	}

}
