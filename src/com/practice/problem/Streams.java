package com.practice.problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Streams {
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");

		Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));

		// System.out.println("Longest String : " + longestString);

		List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 35));
		
		
		double averageAge = persons.stream().mapToInt(Person::getAge).average().orElse(0);
		
		
		System.out.println("Average age : " + averageAge);
		
	}

}
