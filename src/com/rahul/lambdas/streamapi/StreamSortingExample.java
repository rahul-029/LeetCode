package com.rahul.lambdas.streamapi;

import java.util.*;

public class StreamSortingExample {

    public static void main(String[] args) {

        // sorted in ascending order by Salary
        getEmployees().stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary()).forEach(System.out::println);

        System.out.println("--------------------");

        // sorted in descending order by Salary
        getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

        System.out.println("--------------------");

        // sorted in ascending order by Name
        getEmployees().stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).forEach(System.out::println);

        System.out.println("--------------------");

        // sorted in descending order by Name
        getEmployees().stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

        // Sorting a map
        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(1, "Stacy", 25000), 20);
        employeeMap.put(new Employee(2, "Ashley", 20000), 40);
        employeeMap.put(new Employee(3, "Lita", 50000), 50);
        employeeMap.put(new Employee(4, "Trish", 45000), 60);

        System.out.println("--------------------");

        // sorted in ascending order by Name
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);

        System.out.println("--------------------");

        // sorted in descending order by Name
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);
    }

    private static List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Austin", 25000));
        employees.add(new Employee(2, "Rock", 200000));
        employees.add(new Employee(3, "Shawn", 90000));
        employees.add(new Employee(4, "TripleH", 80000));
        employees.add(new Employee(1, "Undertaker", 100000));

        return employees;
    }
}


class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
