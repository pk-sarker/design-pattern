package com.dp.creational.abstractfactory;

public class Vegetable extends GroceryBase {
	private String brandName = "";
	private double unitPrice = 5.99;
	private double totalPrice = 0.0;
	private int quantity = 0;
	
	Vegetable(String brandName, int quantity) {
		this.brandName = brandName;
		this.quantity = quantity;
	}
	
	@Override
	public void addItems() {
		this.totalPrice = this.unitPrice * this.quantity;
	}

	@Override
	public void displayItem() {
		System.out.println(" => Grocery -> Vegetable ");
		System.out.println("Brand: " + this.brandName + " , Quantity: " + Integer.toString(this.quantity) + ", Price: " + Double.toString(this.totalPrice));
	}
}
