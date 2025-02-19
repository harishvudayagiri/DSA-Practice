package com.lambdas;

public class Greeting {

    public  void greet(Greeter greeter)
    {
        greeter.perform();
    }
    public static void main(String[] args) {

        Greeting greeting=new Greeting();
        Greeter greetFromImp = new HelloWorld();
        greetFromImp.perform();
        Greeter lamdaGreeting =()-> System.out.print("Hello World");

        lamdaGreeting.perform();
    }
}
