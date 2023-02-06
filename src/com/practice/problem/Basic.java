package com.practice.problem;

public class Basic {

	public static void add() {

		int a = 10;
		int b = 20;

		int c = a + b;

		System.out.println("The Value is " + c);
	}

	public void addPlus() {

		int a = 10;
		int b = 20;

		int c = a + b;

		System.out.println("The Value is " + c);
	}

	public static void main(String[] args) {

		Basic.add();

		Basic basic = new Basic();

		basic.addPlus();

	}

}
