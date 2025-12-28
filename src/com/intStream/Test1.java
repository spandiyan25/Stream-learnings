package com.intStream;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {1,2,4,5,7,23,435,5677,33};
		
		int val = Arrays.stream(arr).mapToInt(Integer::intValue).sum();
		System.out.println(val);
		
		
		int [] arr1 = new int [] {1,2,4,5,7,23,435,5677,33};
		
		int intStream = Arrays.stream(arr1).sum();
		
		System.out.println(intStream);
		

	}

}
