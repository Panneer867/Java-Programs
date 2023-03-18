package com.practice.problem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MinimumMaximum {

	public int solve(ArrayList<Integer> a) {
		int sum = Stream.of(a).flatMapToInt(x -> x.stream().mapToInt(i -> i)).max().getAsInt()
				+ Stream.of(a).flatMapToInt(x -> x.stream().mapToInt(i -> i)).min().getAsInt();
		return sum;
	}

	public static void main(String[] args) {
		MinimumMaximum mm = new MinimumMaximum();
		ArrayList<Integer> n = new ArrayList<>(Arrays.asList(-2, 1, -4, 5, 3));
		System.out.println(mm.solve(n));

	}

}
