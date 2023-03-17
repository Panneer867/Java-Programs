package com.practice.problem;
public class PrimeOrNot {

	public static void main(String[] args) {

		boolean b = false;

		int i = 2;
		int n = 98;

		while (i <= n / 2) {
			if (n % i == 0) {
				b = true;
				break;
			}
			i++;
		}

		if (b == false) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}

	}

}
