package com.practice.problem;

public class StingManipulation {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "world";

		int result = str1.compareTo(str2);
		System.out.println(result);
		if (result < 0) {
			System.out.println(str1 + " is lexicographically less than " + str2);
		} else if (result == 0) {
			System.out.println(str1 + " is lexicographically equal to " + str2);
		} else {
			System.out.println(str1 + " is lexicographically greater than " + str2);
		}
		
		
		System.out.println((str1.substring(1)));
		
		System.out.println((str1.substring(4,str1.length())));
	}

}
