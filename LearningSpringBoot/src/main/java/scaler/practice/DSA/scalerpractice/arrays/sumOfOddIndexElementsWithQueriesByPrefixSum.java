package scaler.practice.DSA.scalerpractice.arrays;

public class sumOfOddIndexElementsWithQueriesByPrefixSum {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 8, 9, 13, 14};
        int[] l = {0, 2, 0, 3, 5};
        int[] r = {2, 5, 5, 6, 6};
        // System.out.print(arr.length);
        int q = 5;
        int[] mat = new int[l.length];
        int rows = mat.length;
        int length = arr.length;
        int[] pf=checkOddPrefix(arr);

        for (int i = 0; i < length; i++) {
            System.out.print(pf[i]+" ");
        }

        System.out.println();
        System.out.println("sumOfOddIndexElementsWithQueriesByPrefixSum");

        for (int i = 0; i < q; i++) {
            int k = l[i];
            int j = r[i];
            mat[i] =  sumOfOddIndexElementsWithQueriesByPrefixSumMethod(pf, k, j);
        }

        for (int i = 0; i < rows; i++) {
            System.out.print(mat[i]+ " ");

        }
    }
    public static int[] checkOddPrefix(int[] arr) {
        int length=arr.length;
        int[] pf = new int[length];

        pf[0] = 0;
        for (int i = 1; i < length; i++) {
            if(i%2==1)
                pf[i] = pf[i - 1] + arr[i];
            else
                pf[i]=pf[i-1];
        }
        return pf;
    }
    public static int sumOfOddIndexElementsWithQueriesByPrefixSumMethod(int[] pf, int k, int j) {
        int sum = 0;
        if(j<k) return 0;
        if (k == 0)
            sum = pf[j];
        else sum = pf[j] - pf[k - 1];
        return sum;
    }
}
