package com.rahul.lambdas.functionalInterfaceDemo;

class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("Calling the run method traditionally");
    }
}

public class RunnableFNIExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new RunnableImpl());
        thread.start();

        //Runnable runnable =  () -> System.out.println("Calling the run method with lambda expression");
        Thread thread1 = new Thread(() -> System.out.println("Calling the run method with lambda expression"));
        thread1.start();
    }
}
