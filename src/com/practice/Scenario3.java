package com.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Scenario3 {

	private static Map<String, String> min;
	private static Map<String, String> max;

	public static void main(String[] args) {
		
ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Ram", "IT", 40000));
		employeeList.add(new Employee("Sam", "HR", 60000));
		employeeList.add(new Employee("John", "IT", 80000));
		employeeList.add(new Employee("Tina", "HR", 55000));
		
		min = employeeList.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment,
							Collectors.collectingAndThen(Collectors
									  .minBy(Comparator.comparing(Employee::getSalary)),
									e -> e.get().getEmployeeName())
							
							));
		
		System.out.println(min);

		
		max = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors
								  .maxBy(Comparator.comparing(Employee::getSalary)),
								e -> e.get().getEmployeeName())
						
						));
	
	System.out.println(max);
	}

}
