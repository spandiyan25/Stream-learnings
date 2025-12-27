package com.test;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		
		
		Consumer<Integer> consumer = new Consumer<>() {
			
			@Override
			public void accept(Integer integer) {
				System.out.println(integer);
			}
		};
		
		Stream<Integer> integer = Stream.of(1,2,3,4,5,6,7,8,9,10);
		integer.forEach(consumer);

	}

}
