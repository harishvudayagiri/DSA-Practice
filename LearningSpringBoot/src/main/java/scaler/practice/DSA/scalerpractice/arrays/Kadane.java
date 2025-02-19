package scaler.practice.DSA.scalerpractice.arrays;

public class Kadane {
    public static int kadane(int[] arr){

        int currSum=0;
        int maxSum=0;

        for(int i=0;i<arr.length;i++){

                currSum=currSum+arr[i];

                if(currSum>maxSum)
                    maxSum=currSum;
            if (currSum<0)
                currSum=0;
        }

//
//        int sum=0;
//        int maxSum=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            sum+=arr[i];
//            if(sum>maxSum){
//                maxSum=sum;
//            }
//            if(sum<0){
//                sum=0;
//            }
//        }
        return maxSum;
    }

    public static void main(String[] args) {
        Kadane k=new Kadane();
        int[] arr={-2,3,4,-1,5,-1,18};
        System.out.println(
                kadane(arr));
    }
}
