package com.practice.problem;
public class NumberPattern {
	
	  public static void main(String[] args) {
	        int rows = 5;

	        for (int i = 1; i <= rows; i++) {
	            int num = 1;
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num = getNextNumber(num);
	            }
	            System.out.println();
	        }
	    }

	    private static int getNextNumber(int num) {
	        if (num == 1) {
	            return 2;
	        } else {
	            int nextNum = num + 1;
	            while (!isPrime(nextNum)) {
	                nextNum++;
	            }
	            return nextNum;
	        }
	    }

	    private static boolean isPrime(int num) {
	        if (num < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

}
