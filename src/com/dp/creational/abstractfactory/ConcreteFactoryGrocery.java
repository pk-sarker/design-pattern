package com.dp.creational.abstractfactory;

public class ConcreteFactoryGrocery extends AbstractFactoryItem {
	public GroceryBase addGroceryItem(String itemName, String brandName, int quantity){
        switch (itemName) {
            case "Coffee":
                return new Coffee(brandName, quantity);
            case "Vegetable":
                return new Vegetable( brandName, quantity);
            case "Chicken":
                return new Chicken(brandName, quantity);    
            default:
                return new Vegetable(brandName, quantity);
        }
    }

    public KitchenAppliancesBase addKitchenItem(String itemName, String brandName, int quantity){
        return null;
    }
}
