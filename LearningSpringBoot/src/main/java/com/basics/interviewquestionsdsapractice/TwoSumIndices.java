package com.basics.interviewquestionsdsapractice;

import java.util.HashMap;

class TwoSumIndices {
    public int[] twoSum(int[] nums, int target) {

        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){

            int complement=target-nums[i];
            if(map.containsKey(complement)){

                return new int[] {map.get(complement),i};
            }

            map.put(nums[i],i);
        }

        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        TwoSumIndices k=new TwoSumIndices();
        int arr[]={2,7,11,15};
        int result[]=new int[2];

        result=k.twoSum(arr,9);

        for (int val:result
             ) {
            System.out.println(val);

        }

    }
}
