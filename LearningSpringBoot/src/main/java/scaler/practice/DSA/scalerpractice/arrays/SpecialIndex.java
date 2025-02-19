package scaler.practice.DSA.scalerpractice.arrays;

import static scaler.practice.DSA.scalerpractice.arrays.sumOfEvenIndexElementsWithQueriesByPrefixSum.checkEvenPrefix;
import static scaler.practice.DSA.scalerpractice.arrays.sumOfOddIndexElementsWithQueriesByPrefixSum.checkOddPrefix;

public class SpecialIndex {

    public static void main(String[] args) {
        int[] arr = {2,6,4,2};
        int l = 0;
        int length = arr.length;
        int pfoSum = 0;
        int pfeSum = 0;
        int TotalOddSum = 0;
        int TotalEvenSum = 0;
        int cnt = 0;
        sumOfEvenIndexElementsWithQueriesByPrefixSum pfEvenObject = new sumOfEvenIndexElementsWithQueriesByPrefixSum();
        sumOfOddIndexElementsWithQueriesByPrefixSum pfOddObject = new sumOfOddIndexElementsWithQueriesByPrefixSum();

//        for (int i = 0; i < arr.length-1; i++) {
//            pfoSum = pfOddObject.sumOfOddIndexElementsWithQueriesByPrefixSumMethod(checkOddPrefix(arr), 0, i - 1);
//            pfeSum = pfEvenObject.sumOfEvenIndexElementsWithQueriesByPrefixSumMethod(checkEvenPrefix(arr), i + 1, length);
//            TotalOddSum = pfoSum + pfeSum;
//
//            pfeSum = pfEvenObject.sumOfEvenIndexElementsWithQueriesByPrefixSumMethod(checkEvenPrefix(arr), 0, i - 1);
//            pfoSum = pfOddObject.sumOfOddIndexElementsWithQueriesByPrefixSumMethod(checkOddPrefix(arr), i + 1, length);
//            TotalEvenSum = pfoSum + pfeSum;
//
//            if (TotalEvenSum == TotalOddSum)
//                cnt++;
//
//        }

        for (int i = 0; i < arr.length; i++) {
            pfoSum = pfOddObject.sumOfOddIndexElementsWithQueriesByPrefixSumMethod(checkOddPrefix(arr), 0, i - 1);
            pfeSum = pfEvenObject.sumOfEvenIndexElementsWithQueriesByPrefixSumMethod(checkEvenPrefix(arr), i + 1, arr.length - 1);
            TotalOddSum = pfoSum + pfeSum;

            pfeSum = pfEvenObject.sumOfEvenIndexElementsWithQueriesByPrefixSumMethod(checkEvenPrefix(arr), 0, i - 1);
            pfoSum = pfOddObject.sumOfOddIndexElementsWithQueriesByPrefixSumMethod(checkOddPrefix(arr), i + 1, arr.length - 1);
            TotalEvenSum = pfoSum + pfeSum;

            if (TotalEvenSum == TotalOddSum)
                cnt++;
        }

        System.out.println("Special Index Count = "+cnt);
    }


}
