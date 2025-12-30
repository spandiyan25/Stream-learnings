package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Scenario1 {

	private static List<String> list;

	public static void main(String[] args) {
		
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Ram", "IT", 40000));
		employeeList.add(new Employee("Sam", "HR", 60000));
		employeeList.add(new Employee("John", "IT", 80000));
		employeeList.add(new Employee("Tina", "HR", 55000));
		
		
		list = employeeList.stream()
					.filter(employee -> employee.getSalary() > 50000)
					.map(Employee::getEmployeeName)
					.collect(Collectors.toList());
					//.forEach(System.out::println);
		System.out.println(list);
	}

}
