package com.dp.creational.abstractfactory;

public class ConcreteFactoryKitchenAppliances extends AbstractFactoryItem {
	public KitchenAppliancesBase addKitchenItem(String itemName, String brandName, int quantity){
        switch (itemName) {
            case "CoffeeMaker":
                return new CoffeeMaker(brandName, quantity);
            case "Juicer":
                return new Juicer( brandName, quantity);
            case "PressureCooker":
                return new PressureCooker(brandName, quantity);    
            default:
                return null;
        }
    }

    public GroceryBase addGroceryItem(String itemName, String brandName, int quantity){
        return null;
    }
}
