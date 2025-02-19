package com.basics.interviewquestionsdsapractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueFrequency {

    //Will be given a frequency array , need to check whether the frequencies are unique or not


    public static void main(String[] args) {

        int[] arr={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};

        System.out.println(frequency(arr));
    }
    static boolean frequency(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer>hs=new HashSet<>();

        for (int i = 0; i < n; i++) {

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1 );
            }
            else
                map.put(arr[i],1 );
        }

        for (Map.Entry<Integer,Integer> value: map.entrySet()
             ) {

            if(hs.contains(value.getValue()))
                return false;
            else
                hs.add(value.getValue());
        }
        System.out.println(map);

        return true;
    }
}
