package com.basics.recursion;

public class PowerFunctionModulo {

    public static void main(String[] args) {

        int A=10,B=3,C=5;

        System.out.println(powerFunctionModulo(A,B,C));
    }

    private static long powerFunctionModulo(int A,int B,int C) {

        if(B==0)
            return 1;
        if(A==0)
            return 0;

        long k=powerFunctionModulo(A,B/2,C);
        k=(k*k)%C;
        if(B%2==1){
            k=(k*A)%C;
        }
        return k;
    }
}
