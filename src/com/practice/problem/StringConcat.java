package com.practice.problem;
public class StringConcat {

	
	public static void main(String[] args) {
		String s= "Panneer";
		
		StringBuilder sb = new StringBuilder();
		for(int i =s.length()-1; i>=0;i--) {
			
			char c = s.charAt(i);
			sb.append(c);
		}
		
		System.out.println(sb);
	}
	
	
}
