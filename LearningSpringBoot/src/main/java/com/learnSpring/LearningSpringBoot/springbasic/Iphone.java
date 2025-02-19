package com.learnSpring.LearningSpringBoot.springbasic;

public class Iphone {

    public static void main(String[] args) {
        Sim sim=new bsnl();
        Mobile iphone=new Mobile();
        iphone.setSim(sim);
        iphone.getSim().newSim();

        Sim sim2=new Airtel();
        iphone.setSim(sim2);
        iphone.getSim().newSim();

    }
}
