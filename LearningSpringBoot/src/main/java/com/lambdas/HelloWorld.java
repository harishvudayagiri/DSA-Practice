package com.lambdas;

public class HelloWorld implements Greeter {
    @Override
    public void perform() {
        System.out.print("Hello World from interface");
    }
}
