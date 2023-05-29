package com.example.learnspringboot;

public class Customer {
	private String cusName;
	private String billAdd;
	private int cusNum;
	private int amtToBePaid;

	public Customer(String cusName, String billAdd, int cusNum, int amtToBePaid) {
		super();
		this.cusName = cusName;
		this.billAdd = billAdd;
		this.cusNum = cusNum;
		this.amtToBePaid = amtToBePaid;
	}
	
	public String getName() {
		return cusName;
	}
	public String getBill() {
		return billAdd;
	}
	
	public int getNum() {
		return cusNum;
	}
	
	public int getPaid() {
		return amtToBePaid;
	}
}


