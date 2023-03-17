package com.practice.problem;

public class FindAllNos {

	public static void main(String[] args) {

		int[] a = { 19, 29, 17, 37, 18, 16 };

		String c = null;
		
		int f =0;

		int[] nn = new int[f];

		for (int i = 0; i < a.length; i++) {

			c = String.valueOf(a[i]);
			char[] s = c.toCharArray();

			if (s[0] == '1') {
				f++;
				
				nn[f] = a[i];
				
			}
		}
		

		System.out.print("{");
		for (int bb : nn) {
			System.out.print(bb + " ,");
		}
		System.out.print("}");
	}

}
