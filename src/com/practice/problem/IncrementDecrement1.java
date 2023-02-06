package com.practice.problem;

public class IncrementDecrement1 {

	public static void main(String[] args) {

		int a = 10;

		int b;

		int c;

		int d;

		b = ++a;

		c = b++;

		d = ++c;

		for (int i = 0; i <= 10; i++) {

			System.out.print(i + " ");
		}

		for (int j = 0; j <= 10; ++j) {

			System.out.print(j + " ");
		}

	}

}
