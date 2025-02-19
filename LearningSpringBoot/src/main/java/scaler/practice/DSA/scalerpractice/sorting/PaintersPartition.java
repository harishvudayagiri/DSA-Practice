package scaler.practice.DSA.scalerpractice.sorting;

import java.util.Arrays;
/*
*
*
Problem Description
Given 2 integers A and B and an array of integers C of size N. Element C[i] represents the length of ith board.
You have to paint all N boards [C0, C1, C2, C3 … CN-1]. There are A painters available and each of them takes B units of time to paint 1 unit of the board.

Calculate and return the minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of the board.
NOTE:
1. 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
2. A painter will only paint contiguous boards. This means a configuration where painter 1 paints boards 1 and 3 but not 2 is invalid.

Return the ans % 10000003.
* */
public class PaintersPartition {

    public static void main(String[] args) {
        int[] arr={3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int k=4;

        int maxTime=maxTimePainters(arr,k);
        System.out.println(maxTime);
    }

    private static int maxTimePainters(int[] arr, int k) {
        int l= Arrays.stream(arr).max().getAsInt();
        int h= Arrays.stream(arr).sum();
        long maxTime=h;
        int totalWorkersUsed=0;
        int workDone=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(checkIf(arr,k,mid))
            {
                maxTime=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return (int)maxTime;
    }

    private static boolean checkIf(int[] task, int painter, int maxTime) {
        int p=1;
        int sum=0;
        for(int i=0;i<task.length;i++){
            sum=sum+task[i];
            if(sum>maxTime){
                p++;
                sum=task[i];
            }
            if(p>painter){
                return false;
            }
        }


        return true;
    }
}
