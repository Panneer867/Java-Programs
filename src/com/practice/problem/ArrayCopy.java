package com.practice.problem;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
	    int[] source = {1, 2, 3, 4, 5};
	    int[] dest = new int[5];

	    System.arraycopy(source, 0, dest, 0, 5);

	    System.out.println("Source array: " + Arrays.toString(source));
	    System.out.println("Destination array: " + Arrays.toString(dest));
	  }

}
