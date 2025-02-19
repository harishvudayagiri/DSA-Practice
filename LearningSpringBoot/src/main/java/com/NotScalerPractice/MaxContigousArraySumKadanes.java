package com.NotScalerPractice;

public class MaxContigousArraySumKadanes {

    public static int kadanes(int [] A){
        int currSum=0;
        int maxSum=0;

        for(int i=0;i<A.length;i++){
            currSum=currSum+A[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0)
                currSum=0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={30,10,3,9,-5,-10,100};
        System.out.println(kadanes(arr));
    }
}
