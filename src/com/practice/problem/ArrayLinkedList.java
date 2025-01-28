package com.practice.problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}

		// Random access
		long start = System.nanoTime();
		arrayList.get(50000);
		System.out.println("ArrayList random access: " + (System.nanoTime() - start) + " ns");

		start = System.nanoTime();
		linkedList.get(50000);
		System.out.println("LinkedList random access: " + (System.nanoTime() - start) + " ns");

		// Insert in the middle
		long sstart = System.nanoTime();
		arrayList.add(50000, 99);
		System.out.println("ArrayList insertion: " + (System.nanoTime() - sstart) + " ns");

		sstart = System.nanoTime();
		linkedList.add(50000, 99);
		System.out.println("LinkedList insertion: " + (System.nanoTime() - sstart) + " ns");

	}
}
