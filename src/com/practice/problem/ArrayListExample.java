package com.practice.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Panneer","Selvam","K","P"));

		
		System.out.println(nameList);
		
		nameList.forEach(name -> System.out.print(name + " "));
		
		
		ListIterator<String> li = nameList.listIterator();
		System.out.println();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
