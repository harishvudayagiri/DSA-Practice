package scaler.practice.DSA.scalerpractice.arrays;

public class NumberOfAGPairs {

    public static int countAGPairs( char[] inputArray){

        int count=0;
        int ans=0;
        for (int i=0;i<inputArray.length;i++){
            if(inputArray[i]=='a'||inputArray[i]=='A')
                count++;
            if(inputArray[i]=='g'||inputArray[i]=='G')
                ans=ans+count;
        }

        return ans;
    }

    public static void main(String[] args) {

        String value="hkaghgaaghg";
        String value1="bcaggaag";
        char[] toValue=value.toCharArray();
        char[] toValue1=value1.toCharArray();

        System.out.println(countAGPairs(toValue));
        System.out.println(countAGPairs(toValue1));

    }
}
