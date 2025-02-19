package scaler.practice.DSA.scalerpractice.arrays;

public class MaxSumOfSubArray {

    public static int MaxSumSubArray(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                for (int k = 0; k <=j ; k++) {
                    int sum=0;
                    sum=sum+arr[k];

                }

            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={2,2,6,4,3,2,5,1,5,3,2,-6,4,2,3,1};
        System.out.println(MaxSumSubArray(arr));
    }
}
