package com.practice.problem;

public class ReverseString {
	
	public static void main(String[] args) {

		String ss ="panneer";
		
		String rev= "";
		
		int len = ss.length()-1;
		
		while(len >=0) {
			rev += ss.charAt(len);
			len--;
		}
		System.out.println(rev);
	}

}
