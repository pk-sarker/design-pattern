package com.dp.creational.prototype;

import java.util.Hashtable;

public class EmployeeCache {
    private static Hashtable<String, Employee> employeeMap  = new Hashtable<String, Employee>();

    public static Employee getEmployeeById(String id) {
        Employee cachedEmployee = employeeMap.get(id);
        return (Employee) cachedEmployee.clone();
    }

    public static void printEmp(String id) {
        System.out.println("---- Print Emp ----");
        Employee cachedEmployee = employeeMap.get(id);
        cachedEmployee.printEmployeeRecord();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Analyst analyst = new Analyst();
        analyst.addEmployee("E-001", "Sudipto Kumar", 5);
        employeeMap.put(analyst.getId(),analyst);

        BackendDeveloper backendDeveloper = new BackendDeveloper();
        backendDeveloper.addEmployee("E-002", "Kamini Saha", 10);
        employeeMap.put(backendDeveloper.getId(),backendDeveloper);

        FrontendDeveloper frontendDeveloper = new FrontendDeveloper();
        frontendDeveloper.addEmployee("E-007", "Anik Kumar Sarker", 7);
        employeeMap.put(frontendDeveloper.getId(),frontendDeveloper);

        TeamLead teamLead = new TeamLead();
        teamLead.addEmployee("E-005", "Anik Kumar Sarker", 12);
        employeeMap.put(teamLead.getId(),teamLead);

//        Square square = new Square();
//        square.setId("2");
//        shapeMap.put(square.getId(),square);
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.setId("3");
//        shapeMap.put(rectangle.getId(), rectangle);
    }
}