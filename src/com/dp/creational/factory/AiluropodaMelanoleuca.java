package com.dp.creational.factory;

public class AiluropodaMelanoleuca implements Species {
	private int count;
    private String name;

    public AiluropodaMelanoleuca() {
        this.count = 0;
        this.name = "Ailuropoda Melanoleuca";
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
