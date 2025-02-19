package scaler.practice.DSA;

import java.util.Arrays;

public class SeivePrime {
    public int k=0;
    public void test(){
        System.out.println("Hi");
    }
    public static void seive(int n){
        boolean A[]=new boolean[n+1];
        for (int i=0;i<n;i++){
            A[i]=true;
        }
//        for (int i=0;i<=n;i++){
//            System.out.println(i+"="+A[i]);        }

        for (int i=2;i*i<n;i++){
            if(A[i]){
                for (int j=i*i;j<=n;j+=i){
                    A[j]=false;
                }
            }

          //  System.out.println(i+"="+A[i]);

    }


//collection.sort
        for (int i=2;i<=n;i++){
            if(A[i]==true)
            System.out.println(i);        }

    }


    public static void main(String[] args) {
    seive(50);
    }
}
