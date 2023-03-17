package com.practice.problem;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {


		Queue<Integer> q = new LinkedList<>();
		
		
		q.offer(1);
		q.offer(2);
		
		System.out.println(q.poll());
		
		
		q.offer(6);
		
		System.out.println(q.peek());

	}

}
