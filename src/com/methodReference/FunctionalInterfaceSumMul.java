package com.methodReference;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceSumMul {

	public static void main(String[] args) {
		
		
		BiFunction<Integer, Integer,Integer> biFunction = Integer::sum;
		int n = biFunction.apply(25, 34);
		System.out.println("sum" + " "+n );
		
//		Consumer<Integer> consumer = Integer::reverse;
//		int n = consumer.accept(2345);
//		System.out.println("sum" + " "+n );
		
		Function<Integer, Integer> function = Integer::reverse;
		int reverse = function.apply(237);
		System.out.println("reverse" + " "+reverse );

	}

}
