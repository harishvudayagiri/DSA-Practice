package scaler.practice.DSA.scalerpractice.hashmap;


import java.util.HashMap;

public class countDistinct {
    public int solve(int[] A) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;


        for(int i=0;i<A.length;i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i],hm.get(A[i])+1);
            }
            else{
                hm.put(A[i],1);
            }
        }

        for(int i=0;i<A.length;i++){
            if(hm.get(A[i])==1)
                count++;
        }

        return count;

    }

    public static void main(String[] args) {
        countDistinct c=new countDistinct();
        System.out.println(c.solve(new int[]{13,15,13,2,9,3,10,10,20,13}));


    }
}