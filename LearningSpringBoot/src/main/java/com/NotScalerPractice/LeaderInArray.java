package com.NotScalerPractice;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {



    public static void main(String[] args) {

        {

            int[] arr={1,3,10,2,6};

            List<Integer> list=leaderInAnArray(arr);
            for(int k:list){

                System.out.print(k+" ");
            }

        }
    }

    private static List<Integer> leaderInAnArray(int[] arr) {

        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();

        int max=arr[n-1];
        list.add(max);

        for (int i = n-2; i >0 ; i--) {
        if(arr[i]>max){
            max=arr[i];
            list.add(max);
        }
        }

        return list;
    }
}
