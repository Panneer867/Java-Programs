package com.practice.problem;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExp {

	public static void main(String[] args) {

		List<List<Integer>> l = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5), Arrays.asList(6, 7, 8, 9));
		
		List<Integer> ll = l.stream().flatMap(Collection::stream).collect(Collectors.toList());
		
		System.out.println(ll);

	}

}
