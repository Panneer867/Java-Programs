package com.practice.problem;

import java.util.Stack;

public class BalancedParanthesis {

	public static boolean isBalnced(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);

			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (!((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '['))) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "(({([()])}))";

		if (isBalnced(s)) {

			System.out.println(s + " is balanced Pranthesis");

		} else {
			System.out.println(s + " is not a balanced Pranthesis");
		}
	}
}
