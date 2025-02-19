package scaler.practice.DSA.scalerpractice.sorting;

public class MergeTwoSubArraysInAnArray {
    public static void main(String[] args) {
        int A[]={4,8,-1,2,6,9,11,3,4,7,13,0};
        mergeTwoSortedArrays(A,2,6,9);
    }

    public static void mergeTwoSortedArrays(int[] a, int s, int m, int e) {
        int c[]=new int[e-s+1];
        int i=s,j=m+1,k=0;
        while(i<=m&&j<=e){
            if(a[i]<a[j]){
                c[k]=a[i];
                k++;i++;
            }
            else
            {
                c[k]=a[j];
                k++;j++;
            }
        }
        while(i<=m){
            c[k]=a[i];
            k++;i++;
        }
        while (j<=e){
            c[k]=a[j];
            k++;j++;
        }
        for(int l=0;l<c.length;l++){
            a[l+s]=c[l];
        }
        for (int b = 0; b < a.length; b++) {
            System.out.print(a[b]+" ");
        }
    }
}
