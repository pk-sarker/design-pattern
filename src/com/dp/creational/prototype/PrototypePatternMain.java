package com.dp.creational.prototype;

public class PrototypePatternMain {

	public static void main(String[] args) {
        EmployeeCache.loadCache();

        Employee clonedEmployee = (Employee) EmployeeCache.getEmployeeById("E-002");
        // System.out.println("Shape : " + clonedEmployee.getType());
        clonedEmployee.printEmployeeRecord();
        clonedEmployee.setExperience(9);
        clonedEmployee.printEmployeeRecord();

        EmployeeCache.printEmp("E-002");
    }

}
