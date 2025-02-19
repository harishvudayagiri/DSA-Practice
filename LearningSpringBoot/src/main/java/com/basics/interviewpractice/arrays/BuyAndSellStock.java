/* Given an array prices[] of length N, representing the prices of the stocks on different days,
the task is to find the maximum profit possible by buying and selling the stocks on different days when
at most one transaction is allowed.
 */
//Note: Stock must be bought before being sold.


package com.basics.interviewpractice.arrays;
public class BuyAndSellStock {

    public static void main(String[] args) {
        int[] p = {7, 6, 4, 3, 1};
        int maxProfit=0;
        int min=Integer.MAX_VALUE;
        int maxProfitIndex=0;
        for (int i = 0; i < p.length ; i++) {
            min=Math.min(min,p[i]);
            maxProfit=Math.max(maxProfit,p[i]-min);
        }
        System.out.println(maxProfit);
    }

}
