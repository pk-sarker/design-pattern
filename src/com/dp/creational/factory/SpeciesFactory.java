package com.dp.creational.factory;

public class SpeciesFactory {

	public Species getSpecies(String species) {
        if(species == null){
            return null;
        }
        if(species.equalsIgnoreCase("panda")){
            return new AiluropodaMelanoleuca();

        } else if(species.equalsIgnoreCase("tiger")){
            return new PantheraTigris();

        }
        return null;
    }
}
