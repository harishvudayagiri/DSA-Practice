package com.basics.interviewquestionsdsapractice;

public class MergeSortedArrays {

    public static int[] MergeSortedArrays(int[] A,int[] B){
        int p1=0;
        int p2=0;
        int k=0;
        int m=A.length;
        int n=B.length;
        int[] c=new int[n+m];
        while(p1<m&&p2<n){

            if(A[p1]<B[p2]){
                c[k]=A[p1];
                p1++;
                k++;

            }
            else {
                c[k]=B[p2];
                p2++;
                k++;

            }

        }
        while(p1<m){
            c[k]=A[p1];
            p1++;
            k++;
        }
        while(p2<n){
            c[k]=B[p2];
            p2++;
            k++;
        }
return c;

    }


    public static void main(String[] args) {
        int[] arr1={1,4,5,6,8};
        int[] arr2={2,3,7,10};

         int c[]=MergeSortedArrays(arr1,arr2);

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }
    }
}
