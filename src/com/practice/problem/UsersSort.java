package com.practice.problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsersSort {
	public static void main(String[] args) {
		User user1 = new User("John", 28);
		User user2 = new User("Jane", 29);
		User user3 = new User("Adam", 36);
		User user4 = new User("Alice", 32);
		User user5 = new User("Jared", 30);
		User user6 = new User("jade", 29);
		User user7 = new User("jaden", 29);

		List<User> users = Arrays.asList(user1, user2, user3, user4, user5, user6, user7);

		List<User> filteredUsers = users.stream().sorted(Comparator.comparingInt(User::getAge) // Sort by age first
						.thenComparing(User::getName)) // Then sort by name
				.collect(Collectors.toList());

		filteredUsers.forEach(System.out::println);
	}
}
