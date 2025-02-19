package com.basics.interviewpractice.arrays;

public class ProductOfArrayExceptItself {

    public static void main(String[] args) {
        int arr[]  = {10, 3, 5, 6, 2};
        arr=productOfArrayExceptItself(arr);

        for (int a:arr
             ) {
            System.out.print(a+" ");
        }
    }

    public static int[] productOfArrayExceptItself(int[] arr){

            long prod=1;
            int n= arr.length;

        for (int i = 0; i <n ; i++) {
            prod=prod*arr[i];
        }

        for (int i = 0; i <n ; i++) {
            arr[i]=(int)(prod/arr[i]);
        }


        return arr;

    }
}
