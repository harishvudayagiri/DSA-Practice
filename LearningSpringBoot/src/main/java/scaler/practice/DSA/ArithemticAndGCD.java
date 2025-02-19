package scaler.practice.DSA;

public class ArithemticAndGCD {

    public static int findPairsDivisibleByVlaue(int[] A, int B) {
        long mod = (long) (1e9 + 7);
        long cnt[] = new long[B];
        int n = A.length;
        for (int i = 0; i < n; i++) {
            cnt[A[i] % B]++;
        }    long ans = (cnt[0] * (cnt[0] - 1)) / 2;
        ans %= mod;
        int i = 1, j = B - 1;
        while (i <= j) {

            if (i == j) {
                ans += (cnt[i] * (cnt[j] - 1)) / 2;
                ans %= mod;
            } else {
                ans += (cnt[i] * (cnt[j]));
                ans %= mod;
            }

            i++;
            j--;
        }

        return (int) ans;
    }

    public static int gcd(int A, int B) {
        if (A == 0)
            return B;
        return gcd(B % A, A);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // System.out.println("max subarray sum = " + maxSubArraySum(arr));

        int[][] d2arr = new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};

      //  System.out.println(findPairsDivisibleByVlaue(arr, 2));
        System.out.println(gcd(4, 16));

    }
}
