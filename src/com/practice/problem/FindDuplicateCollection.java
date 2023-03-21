package com.practice.problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateCollection {

	public static void main(String[] args) {
		//
		List<Integer> l = Arrays.asList(10, 20 ,20,30, 40);
		
		
		List<Integer> k = l.stream().distinct().collect(Collectors.toList());
		
		System.out.println(k);
		
		List<Integer> b = k.stream().filter(i ->Collections.frequency(l, i) > 1).collect(Collectors.toList());
		
		System.out.println(b);
	}

}
