package com.practice.problem;

public class IncrementDecrement3 {

	public static void main(String[] args) {

		int a = 10;

		int b;

		int c;

		int d;

		d = ++a;
		b = d++;
		a = ++b;
		c = d++;
		d = ++c;

		System.out.println(a + "\t" + b + "\t" + c + "\t" + d);

	}

}
