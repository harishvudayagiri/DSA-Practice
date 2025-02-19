package com.NotScalerPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class secondLargestNumberInArray {

    public static int secNumArray(int [] A){
        int finalNum=0;
        int cnt=0;
        Arrays.sort(A);

        for (int i=0;i< A.length&&cnt<2;i++){
            finalNum=A[i];
            cnt++;
        }
        return finalNum;
    }

    public static void main(String[] args) {

        int[] arr={30,10,3,9,-5,10};
        System.out.println(secNumArray(arr));
    }
}
