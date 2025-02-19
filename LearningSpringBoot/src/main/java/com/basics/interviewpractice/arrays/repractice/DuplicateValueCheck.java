package com.basics.interviewpractice.arrays.repractice;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateValueCheck {

    static void duplicateValueCheck(int[] arr) {

        HashSet<Integer> set = new HashSet<>();


        Arrays.stream(arr).filter(i-> !set.add(i)).forEach(System.out::println);
    }


    public static void main(String[] args) {

        int [] arr={6,2,3,1,4,5,6,9,8,7,9};
        duplicateValueCheck(arr);
    }
}
