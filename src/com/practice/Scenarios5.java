package com.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Scenarios5 {
	
	
private static int sum;

public static Boolean orderCompleted(Order order) {	
		return order.getOrderStatus().equalsIgnoreCase("COMPLETED");
	}

	public static void main(String[] args) {
		
		
		List<Order> orderList = new ArrayList<>();
		
		orderList.add(new Order(101,"COMPLETED",1000,LocalDate.parse("2025-01-01")));
		orderList.add(new Order(102,"CANCELLED",500,LocalDate.parse("2025-01-01")));
		orderList.add(new Order(103,"COMPLETED",2000,LocalDate.parse("2025-01-02")));
		
		
		sum = orderList.stream()
				 .filter(Scenarios5::orderCompleted)
				 .mapToInt(Order::getOrderAmount).sum();
		
		System.out.println(sum);

	}
	
	

}
