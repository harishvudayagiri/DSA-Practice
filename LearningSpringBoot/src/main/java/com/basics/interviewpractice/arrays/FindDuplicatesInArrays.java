package com.basics.interviewpractice.arrays;

import java.util.*;
import java.util.stream.IntStream;

public class FindDuplicatesInArrays {

    public static void main(String[] args) {

        int[] n={1, 2, 3, 6, 3, 6, 1,11,121};
        List<Integer> k=Arrays.asList(1, 2, 3, 6, 3, 6, 1,11,12);
        HashSet<Integer> hs=new HashSet<>();

        for (int i:n) {
            hs.add(i);
        }

        System.out.println("Just check");

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

      //  k.stream().distinct().forEach(System.out::println);
        Set<Integer> set = new HashSet();
     //   k.stream().filter(l -> !hs.add(l)).forEach(System.out::println);
     //   k.stream().filter(i-> !hs.add(i)).forEach(System.out::println);


      //  k.stream().map(i ->i+" ").filter(i-> i.endsWith("2")).forEach(System.out::print);

        //k.stream().distinct().forEach(System.out::println);
      //  k.stream().filter( i-> hs.add(i)).forEach(System.out::print);
        k.stream().filter(i -> hs.add(i)).forEach(System.out::println);
        k.stream().map(i-> i+" ").filter(i -> i.startsWith("1")).forEach(System.out::print);
        System.out.println("Duplicate elements");

        System.out.println("Find First Element");

        k.stream().findFirst().ifPresent(System.out::println);
        k.stream().max(Integer::compareTo).ifPresent(System.out::println);

        System.out.println("Sorted Order");



        k.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


      //  Arrays.stream(n).filter(i -> i%2==0).forEach(System.out::print);


//
//        ArrayList<Integer> arr1=new ArrayList<>();
//
//
//        for (int i = 0; i < n.length; i++) {
//
//            if(map.containsKey(n[i]))
//            {
//                map.put(n[i], map.get(n[i])+1);
//            }
//            else map.put(n[i],1);
//
//        }
//
//        for(Map.Entry<Integer,Integer> entry1:map.entrySet()){
//            if(entry1.getValue()>1)
//                arr1.add(entry1.getKey());
//        }
//
//        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
//            if(entry.getValue()>1)
//                arr.add(entry.getKey());
//        }
        System.out.println("Cubes greater than 50");

        k.stream().map(i-> i*i*i).filter(i -> i>50).forEach(System.out::println);

        Arrays.parallelSort(n);

        System.out.println("convert the sorted array into Stream");

        Arrays.stream(n).forEach(System.out::println);

        System.out.println("To Uppercase");

        String [] ch={"Hash","CHInNu","aNu"};

        Arrays.stream(ch).map(i -> i.toUpperCase()).forEach(System.out::println);
    }
}
