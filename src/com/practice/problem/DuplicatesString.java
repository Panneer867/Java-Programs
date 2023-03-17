package com.practice.problem;
import java.util.HashMap;
import java.util.Map;

public class DuplicatesString {

	public static void main(String[] args) {

		String ss = "panneer";

		Map<Character, Integer> m = new HashMap<>();
		
		for(Character c : ss.toCharArray() ) {
			if(m.containsKey(c)) {
				m.put(c, (m.get(c) +1));
			} else {
				m.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : m.entrySet()) {
			
				System.out.print(entry.getKey() + " ," +  entry.getValue());
			
		}

	}

}
