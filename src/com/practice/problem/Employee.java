package com.practice.problem;

import java.util.Objects;

public class Employee {

	private String name;
	private int id;

	public Employee(int salary, String name) {
		this.name = name;
		this.id = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		Employee ee = (Employee) obj;
		return id == ee.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/*
	 * public static void main(String[] args) { Employee employee = new
	 * Employee("John Doe", 50000);
	 * 
	 * try { FileOutputStream fileOut = new FileOutputStream("employee.txt");
	 * ObjectOutputStream out = new ObjectOutputStream(fileOut);
	 * out.writeObject(employee); out.close(); fileOut.close();
	 * System.out.println("Serialized data is saved in employee.ser"); } catch
	 * (IOException e) { e.printStackTrace(); }
	 * 
	 * try { FileInputStream fileIn = new FileInputStream("employee.txt");
	 * ObjectInputStream in = new ObjectInputStream(fileIn); Employee e = (Employee)
	 * in.readObject(); in.close(); fileIn.close();
	 * System.out.println("Deserialized Employee..."); System.out.println("Name: " +
	 * e.getName()); System.out.println("Salary: " + e.getSalary()); } catch
	 * (IOException e) { e.printStackTrace(); } catch (ClassNotFoundException e) {
	 * e.printStackTrace(); } }
	 */

}
