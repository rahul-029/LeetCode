package com.rahul.lambdas.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        // traditional way of filtering
        for (Product product: getProducts()){
            if(product.getPrice() > 25000){
                productList.add(product);
            }
        }

        for (Product product : productList){
            System.out.println(product);
        }

        System.out.println("-----------------------");
        // Stream API way
        /*List<Product> list = getProducts().stream().filter((product) -> product.getPrice() > 25000).collect(Collectors.toList());
        list.forEach(System.out::println);*/

        getProducts()
                .stream()
                .filter((product) -> product.getPrice() > 25000)
                .forEach(System.out::println);
    }

    private static List<Product> getProducts(){

        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "HP laptop", 25000));
        products.add(new Product("2", "Apple laptop", 35000));
        products.add(new Product("3", "Sony laptop", 45000));
        products.add(new Product("4", "Acer laptop", 30000));
        products.add(new Product("5", "Lenevo laptop", 50000));

        return products;
    }
}

class Product {

    private String id;
    private String name;
    private int price;

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
