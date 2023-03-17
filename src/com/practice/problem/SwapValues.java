package com.practice.problem;
public class SwapValues {

	public static void main(String[] args) {

		int a = 50;
		int b = 40;

		a = a + b; // Add the values of a and b and assign the result to a
		b = a - b; // Subtract the original value of b from the new value of a and assign the
					// result to b
		a = a - b; // Subtract the new value of b from the new value of a and assign the result to
					// a

		System.out.println("a = " + a); // Output: a = 10
		System.out.println("b = " + b); // Output: b = 5

	}

}
