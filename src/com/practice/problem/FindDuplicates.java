package com.practice.problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {

		String ss = "Panneer";
		
		int[]  a= {10,20,30,42,84,56,92,45,28,94,58}; 

		List<String> g = Arrays.stream(ss.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(g);
		
		
		Integer in = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		
		System.out.println(in);
		
		List<String> dd= Arrays.stream(a).boxed().map(s -> s+ "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(dd);
		
	}

}
