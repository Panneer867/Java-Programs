package com.practice.problem;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumbers {
	
	
	
	public static void main(String[] args) {
		
	
		Random rr = new Random();
		IntStream ss = rr.ints(10, 99);

		OptionalInt result = ss.findFirst();
		
		System.out.println(result.getAsInt());
	}

}
