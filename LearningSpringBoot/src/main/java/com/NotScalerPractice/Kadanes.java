package com.NotScalerPractice;

public class Kadanes {

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 4, 5, -6, 7, 8, -9, 10 };

        System.out.println(kadanes(arr));
    }

    private static int kadanes(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum)
                maxSum=sum;
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }
}
