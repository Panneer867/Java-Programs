package com.practice.problem;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveSpace {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		String name ="Panneer  Selvam";
		
		String namea =Stream.of(name).map(s -> s.trim().replaceAll("\\s+", "")).findAny().get();
		
		
		
		System.out.println(namea);
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squaredNumbers = numbers.stream()
		    .filter(n -> (n % 2 !=0) )
		    .collect(Collectors.toList());
		System.out.println(squaredNumbers); 
		
		long endTime = System.currentTimeMillis();
		
		Double ee = (double) (endTime -startTime);
		
		
		System.out.println(ee/1000); 
		
	}

}
