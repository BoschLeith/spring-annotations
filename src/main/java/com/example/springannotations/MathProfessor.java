package com.example.springannotations;

public class MathProfessor implements Professor{

	@Override
	public void teach() {
		System.out.println("Teaching math");
	}

}
