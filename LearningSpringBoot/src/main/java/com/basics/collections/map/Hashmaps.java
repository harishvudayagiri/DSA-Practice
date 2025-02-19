package com.basics.collections.map;

import java.util.*;

public class Hashmaps {

    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();

        map.put("Hash","Anu");
        map.put("Harish","Nami");
        map.put("Harry","Ruks");
        map.put("Haris","Sd");

        System.out.println("==========Stream API=======");

        //map.forEach((k,v)-> System.out.println("key= "+k+" value ="+v));
        map.forEach((k,v)->System.out.println("key="+k+" value="+v));

       System.out.println("==========Iterator=======");
       Iterator<String> it=map.keySet().iterator();

        while (it.hasNext()){
            String key=it.next();
            String value=map.get(key);
            System.out.println("key = "+key+" value "+value);
        }

        Iterator<String> itNew=map.keySet().iterator();
        Iterator<Map.Entry<String ,String>> it1=map.entrySet().iterator();
        while (it1.hasNext()){
            Map.Entry<String,String>entry=it1.next();
            System.out.println("key="+entry.getKey()+" value="+entry.getValue());
        }

        System.out.println("========== Stream API==========");
         map.forEach((k,v)-> System.out.println(k+v));
        while (itNew.hasNext())
        {
            String key=itNew.next();
            String value=map.get(key);
            System.out.println("key= "+key+" value="+value);




        }
        System.out.println("========= Map to ArrayList========");
        HashMap<String,Integer> compMap=new HashMap<>();

        compMap.put("Google",1000);
        compMap.put("Facebook",8000);
        compMap.put("Apple",4000);

        Iterator compIter=compMap.entrySet().iterator();

        while (compIter.hasNext()){
            Map.Entry pairs=(Map.Entry)compIter.next();
            System.out.println(pairs.getKey()+" = "+pairs.getValue());
        }
        System.out.println("========Converted Map in Array=======");

        List<String> compList=new ArrayList<>(compMap.keySet());
        List<Integer>compSizelist=new ArrayList<>(compMap.values());
        for (String k:compList
             ) {
            System.out.println(k);
        }
        for (int i: compSizelist
             ) {
            System.out.println(i);
        }
    }


}
