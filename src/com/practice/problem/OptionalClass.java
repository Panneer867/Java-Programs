package com.practice.problem;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {


		String ss = null;
		
		
		Optional<String> op = Optional.of(ss);
		
		System.out.println("The Value is " + op);
		
		

	}

}
