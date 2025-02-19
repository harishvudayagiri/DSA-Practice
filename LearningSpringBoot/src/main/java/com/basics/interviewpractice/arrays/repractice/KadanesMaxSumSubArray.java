package com.basics.interviewpractice.arrays.repractice;

public class KadanesMaxSumSubArray {

   public static int checkadanesMaxSumSubArray(int[] arr) {
        int n=arr.length;
        int sum=0;
        int maxSum=0;

        for (int i = 0; i < n; i++) {
            sum=arr[i]+sum;
            if(sum<0)
                sum=0;
            else if (sum>0) {
                maxSum=Math.max(maxSum,sum);
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, 5, -4};
        int[] arr1 = {1,2,3,-7,2, 4, 6,-3 ,4};
        //System.out.println("max sum sub array"+checkadanesMaxSumSubArray(arr));
        System.out.println("max sum sub array "+kadane(arr1));
    }

    public static int kadane(int[] arr){
       int maxSum=0;
       int currSum=0;

        for (int i = 0; i < arr.length; i++) {

            currSum=currSum+arr[i];
            if (currSum<0){
                currSum=0;
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }

       return maxSum;
    }
}
