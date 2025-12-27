package com.test;

import java.util.stream.Stream;

public class LamdaConsumerSupplier {

	public static void main(String[] args) {
		
		
		Stream.generate(() -> "hello ").limit(10).forEach(i -> System.out.println(i));
		
		Stream.of(1,2,3,4,5,6,7).forEach(i -> System.out.println(i));

	}

}
