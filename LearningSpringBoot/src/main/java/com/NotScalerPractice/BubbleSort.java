package com.NotScalerPractice;

public class BubbleSort {

    public static int[] bubbleSortAlgo(int[] arr){

        int n=arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <n-i-1 ; j++) {

                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr={1,3,10,2,6};

        int[] output=bubbleSortAlgo(arr);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }
    }
}
