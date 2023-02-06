package com.practice.problem;

public class RepeatedCharacter {
	
	public static void repeat() {
		
		String ss = "Panneer";
		
		char ch[] =ss.toCharArray();
		
		for(int i= 0; i<ch.length;i++) {
			
			for(int j =i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					System.out.println(ch[i] + " is repeated word");
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		repeat();
		
	}
}
