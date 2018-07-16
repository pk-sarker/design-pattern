package com.dp.creational.abstractfactory;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {
		AbstractFactoryItem groceryFactory = FactoryCreator.getFactory("grocery");
		GroceryBase vegetable = groceryFactory.addGroceryItem("Vegetable", "Bondi Produce", 1);
		vegetable.addItems();
		GroceryBase coffee = groceryFactory.addGroceryItem("Coffee", "Tim Hortons", 3);
		coffee.addItems();
		GroceryBase chicken = groceryFactory.addGroceryItem("Chicken", "The Wheel of Chicken", 2);
		chicken.addItems();
		
        AbstractFactoryItem kitchenAppFactory = FactoryCreator.getFactory("kitchen");
        KitchenAppliancesBase coffeeMaker = kitchenAppFactory.addKitchenItem("CoffeeMaker", "Black Decker", 1);
        coffeeMaker.addItems();
        KitchenAppliancesBase juicer = kitchenAppFactory.addKitchenItem("Juicer", "Oster", 1);
        juicer.addItems();
        KitchenAppliancesBase pressureCooker = kitchenAppFactory.addKitchenItem("PressureCooker", "Walmart", 1);
        pressureCooker.addItems();
        
        
        vegetable.displayItem();
        coffee.displayItem();
        chicken.displayItem();
        
        System.out.println("-------------------------------------- ");
        
        coffeeMaker.displayItem();
        juicer.displayItem();
        pressureCooker.displayItem();
	}

}
