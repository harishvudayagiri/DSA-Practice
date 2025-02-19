package scaler.practice.DSA.scalerpractice;

public class AggresiveCows {

    public static int aggresiveCows(int[] A,int B){

        int n=A.length;

        int l=A[0],r=A[n-1]-A[0],ans=0,minDiff=Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            int diff=A[i]-A[i-1];
            if (diff<minDiff) minDiff=diff;

        }
        l=minDiff;

        while(l<=r){
            int mid=(l+r)/2;
            boolean verdict=checkdisvalid(A,mid,B);
            if(verdict==true){
                l=mid+1;
                ans=mid;
            }
            else r=mid-1;
        }

        return ans;
    }

    private static boolean checkdisvalid(int[] A, int mid, int cows) {
        int cnt=1,last=A[0];
        int n=A.length;
        for (int i=0;i<n;i++){
            if(A[i]-last>=mid){
                cnt++;
                last=A[i];
            }
        }

        if(cnt>=cows) return true;

        return false;
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,10};

        System.out.print(aggresiveCows(arr,3));
    }
}
