package com.lambdas;

public class MainClass {
    public static void main(String[] args) {
        NewInterface lambda=s->s.length();
        System.out.print(lambda.sayHi("Anu"));
    }
}

 interface NewInterface {
    int sayHi(String s);
}
