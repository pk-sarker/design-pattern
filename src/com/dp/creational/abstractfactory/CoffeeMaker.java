package com.dp.creational.abstractfactory;

public class CoffeeMaker extends KitchenAppliancesBase {
	private String brandName = "";
	private double unitPrice = 25.75;
	private double totalPrice = 0.0;
	private int quantity = 0;
	
	CoffeeMaker(String brandName, int quantity) {
		this.brandName = brandName;
		this.quantity = quantity;
	}
	
	
	@Override
	public void addItems() {
		this.totalPrice = this.unitPrice * quantity;
	}

	@Override
	public void displayItem() {
		System.out.println(" => Kitchen Appliances -> Coffee Maker ");
		System.out.println("Brand: " + this.brandName + " , Quantity: " + Integer.toString(this.quantity) + ", Price: " + Double.toString(this.totalPrice));
	}
	
}
