package com.basics.lambdaexpressions;
@FunctionalInterface
public interface lambdaexpressions {

    void add();

    default void addnumbers(){

        System.out.println("Hi");
    }
}
