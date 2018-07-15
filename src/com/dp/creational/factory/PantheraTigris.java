package com.dp.creational.factory;

public class PantheraTigris implements Species {
	public int count;
    private String name;

    public PantheraTigris() {
        this.count = 0;
        this.name = "Panthera Tigris";
    }

    @Override
    public void addSpecies() {
        this.count++;
    }

    @Override
    public void countSpecies() {
        System.out.println("----- " + this.name + " ----- ");
        System.out.println("Count: " + Integer.toString(this.count));
    }
}
