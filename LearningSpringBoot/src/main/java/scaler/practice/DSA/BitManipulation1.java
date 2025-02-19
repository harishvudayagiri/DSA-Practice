package scaler.practice.DSA;

public class BitManipulation1 {
    public static void main(String[] args) {
        int x=9;
        //System.out.println(x|1);
        //System.out.println(x<<9);
        //System.out.println(x>>1);
        //System.out.println(value);
        //setithBit(8,4);
        //System.out.println(checBit(8,3));
        //System.out.println(checBit(8,0));
       // System.out.println(countSetBits(63));
        //System.out.println(unsetithBit(8,2));
        //System.out.println(printValues(0,3,4,5));
        //int[] arr={2,3,6,1,4,2,6,4,3,1,9,6,6};
     //   System.out.println(findUnique(arr));
        int[] arr1={2,3,2,1,4,2,6,4,3,1,9,6,6,3,1,4};
        System.out.println(findUniquefrom3(arr1));

    }

    private static int findUniquefrom3(int[] arr1) {

        int value=0;
        int n=arr1.length;

        for(int i=0;i<32;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(checBit(arr1[j],i)) {cnt++;}

            }
            if(cnt%3!=0) {
                value=value+(1<<i);
            }
        }

        return value;
    }



    private static int findUnique(int[] arr) {
        int value=0;
        for (int i=0;i<arr.length;i++){
            value=value^arr[i];
        }

        return  value;
    }

    private static int printValues(int A,int a, int b, int c) {
            for(int i=c;i<b+c;i++){
               A= setithBit(A,i);
            }
        return  A;
    }

    public static int setithBit(int A,int x){
      return   A=A|(1<<x);
    }
    public static boolean checBit(int A,int X){
    int test;
        if((A&(1<<X))==0) return false;
        else return true;
    }

    public static int countSetBits(int A){
    int count=0;
        for (int i=0;i<32;i++) {
            if(checBit(A, i)==true) count++;
        }
        return count;
    }

    public static int unsetithBit(int A,int x){
        int k;
        if(checBit(A,x)==true) {
            A=A^(1<<x);
           return A;
        }
        return 0;
    }
}
