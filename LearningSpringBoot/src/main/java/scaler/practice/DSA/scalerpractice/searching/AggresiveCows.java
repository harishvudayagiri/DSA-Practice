package scaler.practice.DSA.scalerpractice.searching;

public class AggresiveCows {

    public int aggresiveCows(int[] A,int m){
        int n=A.length;
        int s=1;
        int ans=0;
        int e=A[n-1]-A[0];
        while (s<=e) {
            int mid= (s+e)/ 2;
                if(isDistValid(A,m,mid)){
                    ans=mid;
                    s=mid+1;
                }
                else e=mid-1;
        }
        return ans;
    }

    private boolean isDistValid(int[] a, int m, int mid) {
        int cows=1;
        int cows_last_pos=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]-cows_last_pos>=mid){
                cows++;
                cows_last_pos=a[i];
                if (cows==m)
                    return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        AggresiveCows A=new AggresiveCows();
        System.out.println(A.aggresiveCows(a,3));
    }
}
