package com.basics.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();

        arr.add("Hash");
        arr.add("Jai");
        arr.add("Harry");
        arr.add("Spartan");
        //System.out.println(arr.get(0));
        int[] arr1={1,2};
        Iterator it1= Arrays.stream(arr1).iterator();

        while (it1.hasNext())
            System.out.println(it1.next());

        for (int a = 0; a < arr.size(); a++) {
            System.out.println(arr.get(a));
        }
        System.out.println("------- for each");

        for (String a:arr)
            System.out.println(a);

        arr.stream().forEach(i -> System.out.println(i));

        System.out.println("------- Iterator");

        Iterator it2=arr.iterator();
        while (it2.hasNext())
            System.out.println(it2.next());

        System.out.println("------- Lambda Expression/Stream API");


        arr.stream().forEach(i -> System.out.println(i));

        CopyOnWriteArrayList<String> syncArrayList=new CopyOnWriteArrayList<>();
        syncArrayList.add("Anu");
        syncArrayList.add("Nami");
        syncArrayList.add("Ruks");
        syncArrayList.add("Sd");

        Iterator<String>sync =syncArrayList.iterator();

        while (sync.hasNext())
            System.out.println(sync.next());
        ArrayList numbers=new ArrayList<>(Arrays.asList(1,2,6,3,4,5,5,6,9,9,9,10,1,2));
        System.out.println("=========== The Actual List ===========");
        System.out.println(numbers);
        System.out.println("=========== Using Linked HashSet ===========");
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(numbers);
        System.out.println(linkedHashSet);
        System.out.println("=========== Using HS ===========");

        HashSet<Integer>hs=new HashSet<>(numbers);
        System.out.println(hs);
        System.out.println("=========== Using Stream API ===========");

        System.out.println(numbers.stream().distinct().collect(Collectors.toList()));

        java.util.Collections.sort(numbers);
        numbers.stream().distinct().forEach(i->{System.out.print(i+",");

        });
        System.out.println("=========== Remove Duplicates from List ===========");

        ArrayList<String>l1=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String>l2=new ArrayList<>(Arrays.asList("A","B","C","D","F"));

        l1.removeAll(l2);
        System.out.println(l1);
    }
}