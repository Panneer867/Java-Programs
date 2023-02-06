package com.practice.problem;

public class TestSingletonClass {

	public static void main(String[] args) {

		SingletonClass class1 = SingletonClass.getInstance();
		SingletonClass class2 = SingletonClass.getInstance();
		
		if(class1== class2) {
			System.out.println("The Objects are Same");
		} else {
			System.out.println("The Objects are different");
		}

	}

}
