import java.util.*;

public class kadanes{
    public static void kadane(int numbers[]) {
        int currsum = 0; int ns = 0; int mns = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            currsum = currsum + numbers[i];
            maxSum = Math.max(currsum, maxSum);
            if (currsum < 0) {
                currsum = 0;
            }
        } System.out.println("Max sum of subarray : " + maxSum);
    }


    public static void main(String args[]) {
         int numbers[] = {-2,-3, -4, -1, -2, -1, -5, -3};
         kadane(numbers);
    }
}