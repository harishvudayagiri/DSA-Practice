package scaler.practice.DSA.scalerpractice;

import java.util.Arrays;

//Calculate no of pairs such that A[i] > B[j]
public class valuePairsMergeSort {

    public static int pairsCount(int [] A,int[] B ){
        int cnt = 0;
        int i = 0;
        int j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] > B[j]) {
                // All remaining elements in B are smaller than A[i]
                cnt += B.length - j;
                j++; // Move to next element in B
            } else if (A[i] == B[j]) {
                // Count remaining elements in B equal to A[i] (including B[j])
                int freq = 1; // Initialize freq to 1 to include B[j]
                while (j + 1 < B.length && B[j + 1] == A[i]) {
                    j++; // Skip consecutive A[i] in B
                    freq++;
                }
                cnt += freq;
            }
            i++; // Move to next element in A
        }


        return cnt;
    }

    public static void main(String[] args) {
        int[] arr1={5, 2, 1, 3, 4};
        int[] arr2={2, 3, 4, 1, 0};
        int cnt=0;
        cnt=pairsCount(arr1,arr2);
        System.out.print(cnt);

    }
}
