package com.practice;

import java.time.LocalDate;

public class Order {
	
	private int orderid;
	private String orderStatus;
	private  int orderAmount;
	private  LocalDate date;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Order(int orderid, String orderStatus, int orderAmount, LocalDate date) {
		super();
		this.orderid = orderid;
		this.orderStatus = orderStatus;
		this.orderAmount = orderAmount;
		this.date = date;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", orderStatus=" + orderStatus + ", orderAmount=" + orderAmount + ", date="
				+ date + "]";
	}
	
	
	

}
