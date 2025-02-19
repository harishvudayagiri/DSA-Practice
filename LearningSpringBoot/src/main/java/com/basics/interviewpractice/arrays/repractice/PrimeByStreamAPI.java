package com.basics.interviewpractice.arrays.repractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeByStreamAPI {

    public boolean primeByStream(int[] arr,int n){

        if(n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){

            if(arr[i]%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9,10,1};
        List<Integer> list=Arrays.asList(1,2,3,5,6,7,8,9,10);
        int k=10;
        HashSet<Integer>hs=new HashSet<>();

        System.out.println(IntStream.rangeClosed(2,k/2).noneMatch(i -> k%i==0));
        Arrays.stream(arr).filter(i->i%2==0).forEach(System.out::println);

        list.stream().map(i-> i +"").filter(i-> i.startsWith("1")).forEach(System.out::println);
        Arrays.stream(arr).filter(i -> !hs.add(i)).forEach(System.out::println);
        Arrays.stream(arr).distinct().forEach(System.out::println);
        Arrays.stream(arr).findFirst().ifPresent(System.out::println);
        System.out.println("Count = "+Arrays.stream(arr).count());

        Arrays.stream(arr).max().ifPresent(System.out::println);
    }
}
