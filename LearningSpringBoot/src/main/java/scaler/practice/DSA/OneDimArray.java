package scaler.practice.DSA;

import java.util.ArrayList;

public class OneDimArray {

    public static int maxSubArraySum(int[] A) {

        int maxSum = 0;
        int currSum = 0;



        for (int i = 0; i < A.length; i++) {
            currSum = currSum + A[i];
            if (currSum < 0) currSum = 0;

            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public static void beggarsFinalearned(int A,int[][] B){

        int[] coins=new int[A];

        for (int i = 0; i < A; i++) {
            coins[i]=0;
        }
        for (int i=0;i<B.length;i++){
            int leftIdx=B[i][0]-1,rightIdx=B[i][1]-1,donationMade=B[i][2];
            coins[leftIdx]=coins[leftIdx]+donationMade;

            if ((rightIdx+1)<A) coins[rightIdx+1]=coins[rightIdx+1]-donationMade;
        }
        prefixSumArray(coins);

    }
    public static void prefixSumArray(int[] A){
        int[] pf=A;
        for (int i=1;i<A.length;i++){
            pf[i]=pf[i]+pf[i-1];
        }
        for (int i=0;i<A.length;i++){
        System.out.println(pf[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {-2, 3, 4, -1, 5, -10, 7};
       // System.out.println("max subarray sum = " + maxSubArraySum(arr));

        int[][] d2arr= new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        beggarsFinalearned(5,d2arr);

    }
}
