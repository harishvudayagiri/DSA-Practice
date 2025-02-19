package scaler.practice.DSA.scalerpractice.arrays;

public class SumFromLtoRWithQueries {

    public static int sumOfElements(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static int sumOfElementsByPrefixSum(int[] arr, int l, int r) {
        int sum = 0;
        if ( l == 0) {
            return sum = arr[r];
        } else return sum = arr[r] - arr[l - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 9, 13, 14};
        int[] l = {0, 2, 0, 3, 5};
        int[] r = {2, 5, 5, 6, 6};
        // System.out.print(arr.length);
        int q = 5;
        int[] mat = new int[l.length];
        int rows = mat.length;
        int col = mat.length;
//        if (l.length == r.length && r.length == q) {
//            for (int i = 0; i < q; i++) {
//                int k = l[i];
//                int j = r[i];
//                 mat[i]= sumOfElements(arr,k,j);
//            }
//        }
//        for (int i = 0; i < rows; i++) {
//                System.out.print(mat[i] + " ");
//
//        }
//        System.out.println("");
        int length = arr.length;
        int[] pf = new int[length];
        pf[0] = arr[0];
        for (int i = 1; i < length; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        System.out.println("sumOfElementsByPrefixSum");

        //if (l.length == r.length && r.length == q) {
            for (int i = 0; i < q; i++) {
                int k = l[i];
                int j = r[i];
                mat[i] = sumOfElementsByPrefixSum(pf, k, j);
            }
        //}
        for (int i = 0; i < rows; i++) {
                System.out.print(mat[i]+ " ");

        }
    }
}