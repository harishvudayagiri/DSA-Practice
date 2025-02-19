package scaler.practice.DSA.scalerpractice.arrays;

public class MultipleQueries {

    public static int[] performMultipleQueriesWithZero(int[][] arr,int n){
        int q= arr.length;;
        int[] singleArray=new int[n];
        int[] psum=new int[n];

        for (int i = 0; i < q; i++) {
            int index=arr[i][0];
            int value=arr[i][1];
            singleArray[index]=singleArray[index]+value;
        }
        psum[0]=singleArray[0];
        for (int i=1;i< psum.length;i++)
        {
            psum[i]=psum[i-1]+singleArray[i];
        }
//        for (int i = 1; i < singleArray.length; i++) {
//            singleArray[i]=singleArray[i-1]+singleArray[i];
//        }

        return psum;
    }

    public static void main(String[] args) {
        int[][] arr={{1,2},{3,-1},{0,5}};
        int n=5;
        int [] k=performMultipleQueriesWithZero(arr,n);
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i]+" ");
        }
    }
}
