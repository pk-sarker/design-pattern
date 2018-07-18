package com.dp.creational.prototype;

public class FrontendDeveloper extends Employee {
    FrontendDeveloper() {
        this.setDesignation("Frontend Developer");
    }

    @Override
    public void printEmployeeRecord() {
        System.out.println("\n\n------- Employee -------");
        System.out.println("ID: "+this.getId());
        System.out.println("Name: "+this.getName());
        System.out.println("Designation: "+this.getDesignation());
        System.out.println("Experience: "+this.getExperience());
    }

    @Override
    public void addEmployee(String id, String name, int experience) {
        this.setId(id);
        this.setName(name);
        this.setExperience(experience);

    }
}