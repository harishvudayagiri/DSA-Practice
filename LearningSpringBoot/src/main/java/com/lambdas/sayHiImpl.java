package com.lambdas;

public class sayHiImpl implements NewInterface{
    @Override
    public int sayHi(String s) {
       return s.length();

    }
}
