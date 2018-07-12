package com.dp.creational.singleton;

import java.util.Set;

public class Organization {
	// create an object of Singleton
    private static Organization ourInstance = new Organization();

    // make the constructor private so that this class cannot be
    // instantiated
    private Organization() {
    }


    public String name;
    public Set<String> specializedArea;
    public Set<String> businessScope;

    // Get the only object available
    public static Organization getInstance() {
        return ourInstance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pushSpecializedArea(String area) {
    	this.specializedArea.add(area);
    }

    public void pushBusinessScope(String businessScope) {
    	this.specializedArea.add(businessScope);
    }

    public void printData() {
        // @TODO: Print organization information
    }
}
