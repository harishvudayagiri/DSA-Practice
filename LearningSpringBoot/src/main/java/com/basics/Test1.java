package com.basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "addcdd";
        String s2 = "addcddz";

        IntStream.range(0,s1.length()).allMatch(i -> s1.charAt(i)==s2.charAt(i));

        String news1=s1.chars().sorted().mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
      //  System.out.println(news1);
        List<String> list=Arrays.asList("c","H","i","n","N","u");

        list.stream().map(String::toUpperCase).forEach(System.out::print);

        list.stream().map(String::toLowerCase).forEach(System.out::print);
        System.out.println("");
        String value =list.stream().collect(Collectors.joining());
        System.out.println(value);
        List<String> myList = Arrays.asList("apple", "banana", "apricot", "cherry");

        Stream<String> k=myList.stream();

//
//        int cnt=0;
//    if(k.length==n.length){
//            for (int i = 0; i < k.length; i++) {
//                if(k[i]==n[i]){
//cnt++;
//            }
//                if(cnt==s1.length())
//                    System.out.println("equal");
//            }
//        }
//    else
//        System.out.println("Not equal");
    }
    }





