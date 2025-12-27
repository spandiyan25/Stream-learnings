package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;

public class StreamUsingStudents {

	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<>();
		
		Student s1 = new Student(1,"soundhara",948557,25);
		Student s2 = new Student(3,"yuva",3454233,24);
		Student s3 = new Student(5,"sangeetha",380523474,45);
		Student s4 = new Student(7,"mithun",43543453,5);
		
		arrayList.add(s1);
		arrayList.add(s2);arrayList.add(s3);
		arrayList.add(s4);
		
		
		
		
		arrayList.stream().filter(i -> i.getAge() > 20).limit(2).forEach(i -> System.out.println(i.getStudentName()));;
		//arrayList.stream().filter(i -> i.getAge() > 20).limit(2).sorted(Comparator.reverseOrder());;

	}

}
