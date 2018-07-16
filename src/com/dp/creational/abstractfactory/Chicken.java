package com.dp.creational.abstractfactory;

public class Chicken extends GroceryBase {
	private String brandName = "";
	private double unitPrice = 7.50;
	private double totalPrice = 0.0;
	private int quantity = 0;
	
	Chicken(String brandName, int quantity) {
		this.brandName = brandName;
		this.quantity = quantity;
	}
	
	@Override
	public void addItems() {
		this.totalPrice = this.unitPrice * this.quantity;
	}

	@Override
	public void displayItem() {
		System.out.println(" => Grocery -> Chicken ");
		System.out.println("Brand: " + this.brandName + " , Quantity: " + Integer.toString(this.quantity) + ", Price: " + Double.toString(this.totalPrice));
	}
}
