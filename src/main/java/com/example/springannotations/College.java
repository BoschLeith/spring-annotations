package com.example.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("Codeup")
	private String collegeName;

	@Autowired
	private Dean dean;

	@Autowired
	private Professor professor;

	public void test(){
		dean.displayDeanInfo();
		professor.teach();
		System.out.println(collegeName);
		System.out.println("Testing");
	}

}
