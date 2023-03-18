package com.practice.problem;

public class BinerySearch {

	public static void main(String[] args) {


		int[]  a= {10,20,30,42,84,56,92,45,28,94,58}; 
		
		
		int m = 28;
		
		int l=0 ; 
		
		int h = a.length;
		
		boolean flag = false;
		
		
		while(l<h) {
			
			int num = l+h/2;
			
			if(m == a[num]) {
				flag = true;
				System.out.println("The element exist in position of " + num);
				break;
				
			} else if(m>a[num]){
				
				l= num + 1;
				
			}else {
				h = num -1;
			}
		}
		
		if(flag == false) {
			System.out.println("The Element is not Found");
		}

	}

}
