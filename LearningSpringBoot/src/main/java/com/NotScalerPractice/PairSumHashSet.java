package com.NotScalerPractice;

import java.util.HashSet;

public class PairSumHashSet {

    public static boolean checkPairSum(int[] arr,int k){

        int n=arr.length;
        HashSet<Integer> hs=new HashSet<>();

        for (int i = 0; i < n; i++) {

            if(hs.contains(k-arr[i])) return true;
            else hs.add(arr[i]);

        }

        return false;
    }

    public static boolean checkPairDiff(int[] arr,int k){

        int n=arr.length;
        HashSet<Integer> hs=new HashSet<>();

        for (int i = 0; i < n; i++) {

            int value=Math.max(k-arr[i],arr[i]-k);
            if(hs.contains(value) )return true;
            else hs.add(arr[i]);

        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};


       // System.out.print(checkPairSum(arr,20));
        System.out.print(checkPairDiff(arr,20));

    }
}
