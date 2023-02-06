package com.practice.problem;

public class FibbanociSeries {

	public static void main(String[] args) {


		int num = 10, num1= 0, num2 = 1;
		
		for(int i=0;i<=num;i++) {
			
			System.out.print(num1 +", ");
			
			
			int nxt = num1+num2;
			
			num1 = num2;
			
			num2 = nxt;
		}

	}

}
