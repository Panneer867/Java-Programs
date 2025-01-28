package com.practice.problem;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamConcatExample {
	public static void main(String[] args) {
		Set<Integer> ar = Set.of(1, 2, 3, 4);
		List<Character> arr = List.of('A', 'B', 'C', 'D', 'E', 'F');

		// Convert Set to List for index-based access
		List<Integer> arList = ar.stream().collect(Collectors.toList());

		// Combine the two collections using streams
		String result = IntStream.range(0, arr.size()).mapToObj(i -> "" + arr.get(i) + arList.get(i % arList.size()))
				.collect(Collectors.joining());

		System.out.println(result); // Output: A4B2C3D4E1F2
	}
}
