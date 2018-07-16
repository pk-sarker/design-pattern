package com.dp.creational.abstractfactory;

public class FactoryCreator {
	private static AbstractFactoryItem factory = null;
    static AbstractFactoryItem getFactory(String choice){
        if(choice.equals("grocery")){
            factory = new ConcreteFactoryGrocery();
        }else if(choice.equals("kitchen")){
            factory = new ConcreteFactoryKitchenAppliances();
        }
        return factory;
    }
}
