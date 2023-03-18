package com.practice.problem;

import java.util.HashMap;

public class WordsCountHashmap {

	public static void main(String[] args) {

		String ss = "Get ready as soon as possible!";
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		
		String[] sl = ss.split(" ");
		
		for(String word: sl) {
			
			Integer in = hm.get(word);
			
			if(in == null) {
				hm.put(word, 1);
			} else {
				hm.put(word, hm.get(word)+1);
			}
		}
		
		System.out.println(hm);
	}
}
