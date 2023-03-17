package com.practice.problem;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{

	private String name;
	private transient int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		Employee employee = new Employee("John Doe", 50000);

		try {
			FileOutputStream fileOut = new FileOutputStream("employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(employee);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in employee.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fileIn = new FileInputStream("employee.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Employee e = (Employee) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("Deserialized Employee...");
			System.out.println("Name: " + e.getName());
			System.out.println("Salary: " + e.getSalary());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
