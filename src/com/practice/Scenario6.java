package com.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Scenario6 {

	private static Map<LocalDate, Object> collect;
	private static Map<LocalDate, List<Integer>> collect1;

	public static void main(String[] args) {
	

		List<Order> orderList = new ArrayList<>();
		
		orderList.add(new Order(101,"COMPLETED",1000,LocalDate.parse("2025-01-01")));
		orderList.add(new Order(102,"CANCELLED",500,LocalDate.parse("2025-01-01")));
		orderList.add(new Order(103,"COMPLETED",2000,LocalDate.parse("2025-01-02")));
		
		collect = orderList.stream()
				 .collect(Collectors.groupingBy(
						 		Order::getDate	 ,
						 		Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Order::getDate)),
						 				i -> i.get().getOrderid())
						 ));
				
		System.out.println(collect);
		
		
		
		
		collect1 = orderList.stream()
				 .collect(Collectors.groupingBy(
						 		Order::getDate	 , 
						 		LinkedHashMap::new ,// we can use map   LinkedhashMap::New to preserve order,
						 		Collectors.mapping(Order::getOrderid, Collectors.toList())
						 ));
				
		System.out.println(collect1);
	}
	
	
	

}
