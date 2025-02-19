package com.basics.interviewpractice.arrays.repractice;

import java.util.Arrays;

public class TwoPointerForPairSum {

    static boolean checkTwoPointerForPairSum(int[] arr,int val){
        int n=arr.length;
        int i=0;
        int j= n-1;
        int sum=0;
        Arrays.sort(arr);

        while(i<j){

            sum=arr[i]+arr[j];
            if(sum==val){
                return true;
            } else if (sum<val) {
                i++;

            } else if(sum>val){
                j--;
            }


        }
        return false;

    }

    public static void main(String[] args) {

            int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(checkTwoPointerForPairSum(arr,12));

    }
}
