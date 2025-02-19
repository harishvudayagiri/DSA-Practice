package com.NotScalerPractice;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArrays {
    public static int[] mergeArraysUsinginbuiltFunction(int[] A,int[] B ){
        int n= A.length+ B.length;

        int[] finalArray=new int[n];
        ArrayList<Integer> finalList=new ArrayList<>();

        for (int k:A)
        finalList.add(k);

        for (int k:B)
            finalList.add(k);

        Collections.sort(finalList);
        for (int i=0;i<finalList.size();i++){
            finalArray[i]=finalList.get(i);
        }

        return finalArray;
    }


    public static int[] mergeSortedArrays(final int[] A, final int[] B) {

        int A_len=A.length;
        int B_len=B.length;
        int len=A_len+B_len;
        int[] ans=new int[len];

        int i=0,j=0,k=0;
        while(i<A.length&&j<B.length){
            if(A[i]<B[j]){
                ans[k]=A[i];
                i++;
                k++;
                }
            else {
                ans[k]=B[j];
                j++;
                k++;
            }

        }

        while(i<A.length){
            ans[k]=A[i];
            i++;
        }

        while(j<B.length){
            ans[k]=B[j];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr1={-5,3,9,10,30};
        int[] arr2={-15,-6,-1,3,7,170};
       int arr[]=mergeArraysUsinginbuiltFunction(arr1,arr2);
        int finalarr[]=mergeSortedArrays(arr1,arr2);

        for (int k:arr){
       //     System.out.println(k);

        }
        for (int k:finalarr){
            System.out.println(k);

        }
    }
}
