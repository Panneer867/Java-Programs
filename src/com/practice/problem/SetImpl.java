package com.practice.problem;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {

	public static void main(String[] args) {
		
		Set<Employee> ss = new HashSet<>();
		
		Employee employee = new Employee(1, "Panneer");
		
		Employee employeeName = new Employee(1, "Panneer");
		
		ss.add(employee);
		ss.add(employeeName);

		System.out.println(ss.size());
	}

}
