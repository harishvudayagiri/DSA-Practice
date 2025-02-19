package com.basics;

import java.util.*;

public class test {
    public static void main(String[] args) {
//        String val[]={"java","hash","ajav","aavj","hhas"};
//
//        HashMap<Integer,String> map=new HashMap<>();
//
//
//        for (int i = 0; i < val.length; i++) {
//            char[] ch=val[i].toCharArray();
//            Arrays.sort(ch);
//            map.put(i, Arrays.toString(ch));
//        }
//
//        for (int i = 0; i < map.size(); i++) {
//
//
//        }
    int[] n={1,2,3,4,5};
    solve(n);

     }

    public static int solve(int[] A) {
        int n=A.length;
        int pf[]=new int[n];

        pf[0]=A[0];
        for(int i=1;i<pf.length;i++){
            pf[i]=pf[i-1]+A[i];
        }


        for(int i=0;i<pf.length;i++){
            System.out.print(pf[i]+" ");
        }

        HashSet<Integer> hs=new HashSet<>();
        for(int k:pf){
            hs.add(k);
        }

        if(hs.size()==pf.length)
            return 0;

        return 1;
    }

}
