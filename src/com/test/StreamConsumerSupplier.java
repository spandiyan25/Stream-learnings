package com.test;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamConsumerSupplier {

	public static void main(String[] args) {
		
		Supplier<String> supplier = new Supplier<>() {
			int i = 0;
		    @Override
		    public String get() {
		    	 i++;
		        return "Hello from Supplier " + i ;
		    }
		}; 
		
		
		Consumer<String> consumer = new Consumer<>(){
			
			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		};

		
		Stream<String> source = Stream.generate(supplier).limit(50000);
		source.forEach(consumer);

	}

}
