package com.test;

public class Student {
	
	private int id;
	private String StudentName;
	private int mobile;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int id, String studentName, int mobile, int age) {
		super();
		this.id = id;
		StudentName = studentName;
		this.mobile = mobile;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", StudentName=" + StudentName + ", mobile=" + mobile + ", age=" + age + "]";
	}
	
	
	

}
