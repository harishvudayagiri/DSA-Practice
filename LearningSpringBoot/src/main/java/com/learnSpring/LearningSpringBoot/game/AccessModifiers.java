package com.learnSpring.LearningSpringBoot.game;

//import scaler.practice.DSA.SeivePrime;

import scaler.practice.DSA.SeivePrime;

public class AccessModifiers extends SeivePrime {

    SeivePrime k=new SeivePrime();



    @Override
    public void test() {
        System.out.println("in child");
    }

    public static void main(String[] args) {
        SeivePrime n=new AccessModifiers();
        SeivePrime k=new SeivePrime();
        k.test();
        n.test();
        n.seive(10);
    }
}
