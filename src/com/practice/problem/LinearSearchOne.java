package com.practice.problem;
public class LinearSearchOne {

	public static void findNumber(int[] d, int b) {

		boolean check = false;
		int count = 0;

		for (int i = 0; i < d.length; i++) {

			if (d[i] == b) {
				check = true;

				count++;
			}
		}

		if (check == false) {

			System.out.println("The searching number is not present");

		} else {
			System.out.println("The searching number is present");
		}

		System.out.println("The searching number is present at " + count + " times");
	}

	public static void main(String[] args) {
		int[] a = { 10, 10, 30, 20, 10 };

		LinearSearchOne.findNumber(a, 10);
	}
}
