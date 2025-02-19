package com.basics.collections.map;

import java.util.HashMap;

public class FrequencyElementMap {


    public static void main(String[] args) {

        int[] A = {2, 5, 9, 2, 8};
        int[] B = {3, 2};

        frequencyElementMap(A,B);

    }

    private static void frequencyElementMap(int[] a, int[] b) {

        HashMap<Integer,Integer>mp=new HashMap();
        HashMap<Integer,Integer>countMap=new HashMap();

        for (int i = 0; i < a.length; i++) {

            if(mp.containsKey(a[i])){
                mp.put(a[i],mp.get(a[i])+1);
            }
            else
            {
                mp.put(a[i],1);
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (mp.containsKey(b[i])){
                countMap.put(b[i],mp.get(b[i]));
            }
            else countMap.put(b[i],0);
        }

        System.out.println(countMap);
    }
}
