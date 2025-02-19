package com.NotScalerPractice;

import java.util.*;

public class PrimeNumber {

    public static boolean checkPrimre(int k){

        int cnt=1;
        int n=Integer.MAX_VALUE;

        if(k==1||k==0){
            return false;
        }

    else {
        for (int i=2;i*i<k;i++){
            if(k%i==0) cnt++;

System.out.print("i="+i+"k="+k);
        }
            if(cnt<2) return true;
    }

        return false;
    }

    public static void main(String[] args) {
        PrimeNumber pm=new PrimeNumber();
        //System.out.println(pm.checkPrimre(17));

        HashSet<Integer> hs=new HashSet();
        System.out.println(hs.add(11));
        System.out.println(hs.add(11));
        System.out.println(hs.add(12));

        List<Integer> nums= Arrays.asList(1,2,3,4);

        int sum=nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        List<Integer> num1=Arrays.asList(5,6,7,8);

        int max=num1.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(max);


    }
}
