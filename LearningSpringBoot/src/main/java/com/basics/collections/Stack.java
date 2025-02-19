package com.basics.collections;

import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {
        System.out.println("Enter the value for recursion");
        Scanner k=new Scanner(System.in);
        int s=k.nextInt();
            recursion(s);


    }

    private static void recursion(int s) throws RuntimeException{

        if (s>10)
            recursion(s-1);

    }
}

class stackOverFlowException extends Exception{

    public  stackOverFlowException(String Message){
        super(Message);
    }
}

