package com.rahul.lambdas.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatmap {

    public static void main(String[] args) {

        /*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map(t -> t * 5).forEach(System.out::println);*/

        List<String> customerNames = getCustomers().stream().map(customer -> customer.getName()).collect(Collectors.toList());
        System.out.println(customerNames);

        List<List<String>> phoneNumbers = getCustomers().stream().map(customers -> customers.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        // flatMap needs a stream as an argument
        List<String> cellphoneNumbers = getCustomers().stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(cellphoneNumbers);
    }

    private static List<Customers> getCustomers(){
        return Stream.of(new Customers(1, "Sachin", Arrays.asList("998877231","887738949")),
                new Customers(2, "Dhoni", Arrays.asList("7777777777","999999999")),
                new Customers(3, "Kohli", Arrays.asList("8888888888","111111111")),
                new Customers(4, "Rohit", Arrays.asList("5555555555","666666666"))).collect(Collectors.toList());
    }
}

class Customers {

    private int id;
    private String name;
    private List<String> phoneNumbers;

    public Customers(int id, String name, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.phoneNumbers = phoneNumbers;
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

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
