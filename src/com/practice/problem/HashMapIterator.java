package com.practice.problem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {

	public static void main(String[] args) {

		HashMap<String, String> hs = new HashMap<>();
		
		hs.put("Panneer", "Selvam");
		hs.put("Surya", "Kumar");
		hs.put("Virat", "Kholi");
		hs.put("Joseshp", "Vijay");
		hs.put("Anil", "Kumar");
		hs.put("Sharat", "Kumar");
		
		
		Iterator<Map.Entry<String, String>> it = hs.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print(", ");
			
		}
		
		System.out.println();
		Iterator<String> itt = hs.keySet().iterator();

		System.out.print("\nKeys: ");
		while(itt.hasNext()) {
			System.out.print(itt.next());
			System.out.print(", ");
			
		}
		
		
		System.out.println();
		Iterator<String> ittt = hs.values().iterator();
		System.out.print("\nValues: ");
		
		while(ittt.hasNext()) {
			System.out.print(ittt.next());
			System.out.print(", ");
		}
	}

}
