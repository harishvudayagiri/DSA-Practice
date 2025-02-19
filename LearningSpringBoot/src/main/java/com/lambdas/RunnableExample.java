package com.lambdas;

public class RunnableExample {


    public static void main(String[] args) {

        Thread lamdaThread=new Thread(()->System.out.println("In Lambda Run"));
        lamdaThread.run();
    }
}
