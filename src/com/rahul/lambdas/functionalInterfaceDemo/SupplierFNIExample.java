package com.rahul.lambdas.functionalInterfaceDemo;

import java.util.function.Supplier;

/*class SupplierImpl implements Supplier<String>{

    @Override
    public String get() {
        return "Hello World";
    }
}*/


public class SupplierFNIExample {

    public static void main(String[] args) {

//        Supplier<String> supplier = new SupplierImpl();
//        System.out.println(supplier.get());


        Supplier<String> supplier  =  () -> "Hello World";
        System.out.println(supplier.get());

    }
}
