package com.practice.problem;
import java.util.HashMap;

public class CheckChars {

	public static void main(String[] args) {

		String ss = "dddeewwttreeeeeeeeee";
		HashMap<Character, Integer> hh = new HashMap<>();

		for (int i = 0; i < ss.length(); i++) {
			char s = ss.charAt(i);
			if (hh.containsKey(s)) {
				int count = hh.get(s);
				hh.put(s, count + 1);

			} else {
				hh.put(s, 1);
			}
		}

		for (Character c : hh.keySet()) {
			System.err.println(c + ":" + hh.get(c));
		}

	}

}
