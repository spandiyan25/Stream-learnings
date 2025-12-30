package com.practice;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Scenario4 {

	private static Map<String, Long> collect;

	public static void main(String[] args) {
		
		
ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Ram", "IT", 40000));
		employeeList.add(new Employee("Sam", "HR", 60000));
		employeeList.add(new Employee("John", "IT", 80000));
		employeeList.add(new Employee("Tina", "HR", 55000));
		
		
		collect = employeeList.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		System.out.println(collect);

	}

}
