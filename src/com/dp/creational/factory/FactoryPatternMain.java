package com.dp.creational.factory;

public class FactoryPatternMain {

	public static void main(String[] args) {
		System.out.println("*** FactoryPattern ***");
        SpeciesFactory speciesFactory = new SpeciesFactory();
        Species panda = speciesFactory.getSpecies("panda");
        Species tiger = speciesFactory.getSpecies("tiger");
        panda.addSpecies();
        panda.addSpecies();
        tiger.addSpecies();

        panda.countSpecies();
        tiger.countSpecies();
	}
}

// Output
// *** FactoryPattern ***
// ----- Ailuropoda Melanoleuca ----- 
// Count: 2
// ----- Panthera Tigris ----- 
// Count: 1
