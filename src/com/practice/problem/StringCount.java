package com.practice.problem;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

	public static void main(String[] args) {

		String ss = "aabbcced";
		char ch;
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ss.length(); i++) {
			ch = ss.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
