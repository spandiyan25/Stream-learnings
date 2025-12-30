package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Scenario2 {

	private static Map<String, List<String>> collect;

	public static void main(String[] args) {
		
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Ram", "IT", 40000));
		employeeList.add(new Employee("Sam", "HR", 60000));
		employeeList.add(new Employee("John", "IT", 80000));
		employeeList.add(new Employee("Tina", "HR", 55000));
		
		collect = employeeList.stream()
		.collect(
				Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(
				Employee::getEmployeeName, Collectors.toList())));
		
		System.out.println(collect);

	}

}
