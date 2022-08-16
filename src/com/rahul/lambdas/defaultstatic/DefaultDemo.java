package com.rahul.lambdas.defaultstatic;

interface Vehicle{

    String getBrand();
    String speedUp();
    String slowDown();

    default String turnAlarmOn(){
        return "Turning car alarm on";
    }

    default String turnAlarmOff(){
        return "Turning car alarm off";
    }

    static String getModelName(){
        return "Skoda Kushaq Monte Carlo Edition";
    }
}

class Car implements Vehicle{

    @Override
    public String getBrand() {
        return "Skoda";
    }

    @Override
    public String speedUp() {
        return "Car is speeding up";
    }

    @Override
    public String slowDown() {
        return "Car is speeding down";
    }
}

public class DefaultDemo {

    public static void main(String[] args) {

        Car vehicle = new Car();
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.slowDown());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());
        System.out.println(Vehicle.getModelName());


    }
}
