package com.practice.problem;

import java.util.List;

public class ListRemove {

	public static void main(String[] args) {
		List<String> list = List.of("I", "heckin'", "love", "java");
		for (int i = 0; i < list.size(); i++) {
			if (i == 1) {
				list.remove(i);
			}
		}
		System.out.println(list);

	}

}
