package com.practice.problem;

public class LinearSearch {

	
	public static int linear(int arr[], int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {

			int arr[] = {10,2,25,67,39,63,99};
			
			int key = 39;
			
			int position = linear(arr, key);
			
			System.out.println(position);
					
	}

}
