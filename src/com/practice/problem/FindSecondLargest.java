package com.practice.problem;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] a = { 10, 20, 24, 75, 8, 32, 2, 33, 52, 98 };

		Integer[] ll = Arrays.stream(a).boxed().toArray(Integer[]::new);

		Arrays.sort(ll, Comparator.reverseOrder());

		a = Arrays.stream(ll).mapToInt(Integer::intValue).toArray();

		System.out.println(a[1]);
	}

}
