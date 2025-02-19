package scaler.practice.DSA.scalerpractice;

import java.util.Arrays;

public class sortByCountsort {

        public static int[] solve(int[] A) {
            int m=0;
            for (int number : A) {
                m = Math.max(m, number);
            }
            int freq[] = new int[m + 1];
            int n=A.length;
            int ans[]=new int[n];


            for (int i = 0; i < n; i++) {
                freq[A[i]]++;
            }

            for (int i = 1; i <= m; i++) {
                freq[i]+=freq[i-1];

            }

            for(int i=n-1;i>=0;i--){
                ans[freq[A[i]]-1]=A[i];
                freq[A[i]]--;
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] arr1={5,3,9,10,30,5};
        int arr[]=solve(arr1);
        for (int i:arr){
        System.out.print(i+" ");
        }
    }

}
