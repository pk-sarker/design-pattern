package com.dp.creational.abstractfactory;

public class PressureCooker extends KitchenAppliancesBase {
	private String brandName = "";
	private double unitPrice = 35.00;
	private double totalPrice = 0.0;
	private int quantity = 0;
	
	PressureCooker(String brandName, int quantity) {
		this.brandName = brandName;
		this.quantity = quantity;
	}
	
	
	@Override
	public void addItems() {
		this.totalPrice = this.unitPrice * this.quantity;
	}

	@Override
	public void displayItem() {
		System.out.println(" => Kitchen Appliances -> Pressure Cooker ");
		System.out.println("Brand: " + this.brandName + " , Quantity: " + Integer.toString(this.quantity) + ", Price: " + Double.toString(this.totalPrice));
	}
}
