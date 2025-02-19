package com.basics;

import java.util.ArrayList;

public class Factors {

    public static void main(String[] args) {
        ArrayList<Integer>factors=new ArrayList<>();
        int k=54;

        for (int i = 1; i <k ; i++) {

            if(k%i==0)
                factors.add(i);
        }
        for (int i:factors
             ) {
            System.out.println(i+" ");

        }

    }


}
