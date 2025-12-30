package com.practice;

import java.util.Objects;

public class Employee {
	
	private String EmployeeName;
	private  String Department;
	private int salary;
	
	
	public Employee(String employeeName, String department, int salary) {
		super();
		EmployeeName = employeeName;
		Department = department;
		this.salary = salary;
	}
	
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Department, EmployeeName, salary);
	}
	
	

	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", Department=" + Department + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Department, other.Department) && Objects.equals(EmployeeName, other.EmployeeName)
				&& salary == other.salary;
	}
	
	
	

}
