package com.example.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

	@Bean
	public College collegeBean(){
		College college = new College();
		return college;
	}

}
