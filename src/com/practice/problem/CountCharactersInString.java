package com.practice.problem;
import java.util.HashMap;

public class CountCharactersInString {

	 public static void main(String[] args) {
	        String str = "aaaabcccceeeef";
	        HashMap<Character, Integer> charCounts = new HashMap<>();

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (charCounts.containsKey(c)) {
	                int count = charCounts.get(c);
	                charCounts.put(c, count + 1);
	            } else {
	                charCounts.put(c, 1);
	            }
	        }

	        for (Character c : charCounts.keySet()) {
	            System.out.println(c + ": " + charCounts.get(c));
	        }
	    }

}
