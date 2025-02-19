package scaler.practice.DSA.scalerpractice.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr={2,13,24,35,47,56,61,73,81};
        int k=81;

        System.out.println(binarySearchValue(arr,k));
    }

    private static int binarySearchValue(int[] arr, int k) {
        int l=0,h= arr.length-1;
        int mid;

        while(l<=h){
            mid=l+(h-l)/2;
            if(arr[mid]==k)
                return mid;
            if(k>arr[mid])
                l=mid+1;
            if(k<arr[mid])
                h=mid-1;

        }
        return -1;
    }
}
