package com.methodReference;

import java.util.function.BiFunction;

public class StringArbitaryType {

	public static void main(String[] args) {
		
		
		 
		BiFunction<String, String, String> biFunction = String::concat;
		String result=biFunction.apply("hello ", "World !!!");
		System.out.println(result);

	}

}
