package com.NotScalerPractice;

public class FizzBuzz {

    public static void main(String[] args) {

        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String[] val=new String[arr.length];
        fizzBuzz(arr);
    }

    private static void fizzBuzz(int[] arr) {
        for(int i=0; i<arr.length; i++) {

             if( arr[i]%3==0&&arr[i]%5==0) {
                System.out.print("FizzBuzz");
            }

             else if(arr[i]%3==0) {
                System.out.print("Fizz"+" ");
            }
             else if( arr[i]%5==0) {
                System.out.print("Buzz"+" ");
            }

             else
                 System.out.print(arr[i]+" ");


        }
    }


}
