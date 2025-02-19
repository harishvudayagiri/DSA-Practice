package scaler.practice.DSA.scalerpractice.sorting;

import static com.basics.interviewquestionsdsapractice.MergeSortedArrays.MergeSortedArrays;

public class MergeSort {



    public static void main(String[] args) {

        int[] arr={3,10,6,8,15,2,12,18,17};

         arr=mergeSort(arr,0,arr.length-1);
        for (int k:arr
             ) {
            System.out.println(k);
        }
    }

    private static int[] mergeSort(int[] arr, int l, int h) {
        int mid=(l+h)/2;
        int[] c=new int[l+h];

            if(l==h)
            {
                int[] b= new int[1];
                b[0]=arr[l];
                return b;
            }

            int[] A = mergeSort(arr, l, mid);
            int[] B = mergeSort(arr, mid + 1, h);
            c = MergeSortedArrays(A, B);

        return c;
    }
}
