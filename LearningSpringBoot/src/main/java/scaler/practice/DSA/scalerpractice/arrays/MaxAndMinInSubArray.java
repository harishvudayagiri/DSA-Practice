package scaler.practice.DSA.scalerpractice.arrays;

public class MaxAndMinInSubArray {


    public static void main(String[] args) {
    int max= Integer.MIN_VALUE;
    int min= Integer.MAX_VALUE;
    int minLen=-1;
    int currVal=0;
    int[] arr={2,2,6,4,3,2,5,1,5,3,2,6,4,2,3,1};
    int last_min_inx=-1;
    int last_max_inx=-1;
    int finalLen=arr.length;

        for (int i=0;i<arr.length;i++){
        if(arr[i]<min) min=arr[i];
    }
    for (int i=0;i<arr.length;i++){
        if(arr[i]>max) max=arr[i];
    }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                last_max_inx=i;
                if(last_min_inx!=-1)
                    finalLen=Math.min(finalLen,i-last_min_inx+1);
            }
            if(arr[i]==min){
                        last_min_inx=i;
                        if(last_max_inx!=-1)
                            finalLen=Math.min(finalLen,i-last_max_inx+1);
                    }
                }

        System.out.println("Minimum Length="+finalLen);
    }

}
