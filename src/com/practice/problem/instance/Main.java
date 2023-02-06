package com.practice.problem.instance;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();

		Car c = null;
		if (vehicle instanceof Car) {
			c = (Car) vehicle;
			System.out.println("test");
		}

		Car cc = null;
		if (vehicle instanceof Car) {
			cc = (Car) vehicle;
			System.out.println("hello");
		}

	}

}
