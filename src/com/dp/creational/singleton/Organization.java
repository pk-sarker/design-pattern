package com.dp.creational.singleton;

import java.util.Set;
import java.util.HashSet;

public class Organization {
	// create an object of Singleton
    private static Organization ourInstance = new Organization();

    // make the constructor private so that this class cannot be
    // instantiated
    private Organization() {
    }


    public String name;
    public Set<String> specializedArea = new HashSet<String>();
    public Set<String> businessScope = new HashSet<String>();

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
    	this.businessScope.add(businessScope);
    }

    public String toString(Set<?> s) {
        StringBuilder sb = new StringBuilder("[ ");
        String sep = "";
        for (Object object : s) {
            sb.append(sep).append(object.toString());
            sep = ", ";
        }
        return sb.append(" ]").toString();
    }
    
    public void printData() {
    	System.out.println("==========================================================");
    	System.out.println("Organization Name: "+ this.name);
    	
        System.out.println("Specialized Area: "+ this.toString(this.specializedArea));
        
        System.out.println("Business Scope: "+ this.toString(this.businessScope));
    }
}
