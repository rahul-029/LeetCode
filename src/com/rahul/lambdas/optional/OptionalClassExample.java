package com.rahul.lambdas.optional;

import java.util.Optional;

public class OptionalClassExample {

    public static void main(String[] args) {

        Employees employee = new Employees(1,"Rahul", "rahul@gmail.com");

        //empty
        //of
        //ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // Will throw a Null Pointer
        /*Optional<String> emailIdOptional = Optional.of(employee.getEmailId());
        System.out.println(emailIdOptional);*/

        Optional<String> employeeEmailId = Optional.ofNullable(employee.getEmailId());
        //System.out.println(employeeEmailId);

        /*if(employeeEmailId.isPresent()){
            System.out.println(employeeEmailId.get());
        }*/

        //System.out.println(employeeEmailId.orElse("Email Not Present"));

        //System.out.println(employeeEmailId.orElseThrow(() -> new IllegalArgumentException("Email Not Present")));

        System.out.println(employeeEmailId.map(String::toUpperCase).orElseGet(() -> "default@gmail.com"));


    }
}
