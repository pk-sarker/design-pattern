package com.dp.creational.abstractfactory;

public abstract class AbstractFactoryItem {
	abstract GroceryBase addGroceryItem(String itemName, String brandName, int quantity);
    abstract KitchenAppliancesBase addKitchenItem(String itemName, String brandName, int quantity);
}
