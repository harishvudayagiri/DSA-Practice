/*
* Given an array A[] of n numbers and another number x,
* the task is to check whether or not there exist two elements in A[] whose sum is exactly x.
*

*
* SOLUTION APPROACH  - TWO POINT APPROACH
* * */


package com.basics.interviewpractice.arrays;

import java.util.Arrays;

public class SearchPairSum {

    public static void main(String[] args) {

        int [] k={1, 4, 45, 6, 10, -8} ;

        Arrays.sort(k);
        int sum=92;
        int n= k.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(k[i]+k[j]==sum){
                System.out.println("Pair exist");
            break;
            }
            else if (k[i]+k[j]<sum)
                i++;
            else if (k[i]+k[j]>sum)
                j--;

        }
        System.out.println("pair Doesnt exist");
        }
    }

