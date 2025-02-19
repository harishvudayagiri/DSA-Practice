package com.basics.lambdaexpressions;

import java.time.LocalDate;
import java.util.Arrays;

public class LambdaUsecase implements lambdaexpressions{
    @Override
    public void add() {

    }

    @Override
    public void addnumbers() {
        lambdaexpressions.super.addnumbers();
    }


    public static void main(String[] args) {

        Arrays.asList();
        lambdaexpressions lm=new LambdaUsecase();
        lm.addnumbers();

        LocalDate date=LocalDate.now();
        System.out.println("Date ="+date);

    }
}
