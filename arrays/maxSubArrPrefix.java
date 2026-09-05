import java.util.*;

public class maxSubArrPrefix {
    public static void MaxSumPrefix(int array[]){
        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + array[i];
        }

        for(int i = 0; i < array.length; i++) {
            int start = i;
            for(int j = i; j < array.length; j++) {
                int end = j;

                // calculation for currSum
                CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.println(CurrSum);
                if (CurrSum > MaxSum) {
                    MaxSum = CurrSum;
                } 
            } 
        } System.out.println("Max Sum : " + MaxSum);


}    
    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        MaxSumPrefix(numbers);
    } 
}