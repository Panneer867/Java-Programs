package com.practice.problem;
import java.util.Arrays;
import java.util.List;

public class HighestValue {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };

		int highestValue = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > highestValue) {
				highestValue = a[i];
			}
		}
		System.out.println(highestValue);

		List<Integer> ss = Arrays.asList(10, 10, 101, 20, 30, 40);

		int sdsd = ss.get(0);

		for (int i = 0; i < ss.size(); i++) {
			if (ss.get(i) > sdsd) {
				sdsd = ss.get(i);
			}
		}
		System.out.println(sdsd);

	}

}
