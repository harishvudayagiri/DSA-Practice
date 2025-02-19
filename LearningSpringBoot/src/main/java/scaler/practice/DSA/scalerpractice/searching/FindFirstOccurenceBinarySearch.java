package scaler.practice.DSA.scalerpractice.searching;

public class FindFirstOccurenceBinarySearch {

    public static void main(String[] args) {

        int[] arr={-5,-5,3,0,0,1,5,5,5,5,8,10,10,15,20,21,22};
        int target=20;
        System.out.println(firstOccurence(arr,target));
    }

    private static int firstOccurence(int[] arr, int target) {

        int l=0,h=arr.length-1;
        int minIndex=h;
        int mid=0;
        while(l<=h){
            mid=l+(h-l)/2;
            if(arr[mid]==target)
            {
                minIndex=Math.min(minIndex,mid);
            h=mid-1;}
            if (arr[mid]>target)
                h=mid-1;
            if(arr[mid]<target)
                l=mid+1;

        }
        return minIndex;
    }
}
