import java.util.*;
// Given an array, 
// build a new array where each index holds the sum of all elements up to that point. 
// E.g. {1,2,3,4} → prefix {1,3,6,10}.


// public class PracticePrefix {
//     public static void SumI(int ith[]) {
//         int newarr[] = new int[ith.length];
//         newarr[0] = ith[0];
//         for(int i = 1; i < newarr.length; i++) {
//             newarr[i] = newarr[i - 1] + ith[i];
//         } System.out.println("Sum of Ith Array : "+ Arrays.toString(newarr));
//     }
    
    
//     public static void main(String args[]) {
//         int number[] = {1,2,3,4};
//         SumI(number);
//     }
// }


// Same problem as before ({1,-2,6,-1,3} → answer 8), but this time use prefix sums 
// to calculate each subarray's sum in O(1) instead of re-summing with a third loop. 
// This should turn your O(n³) brute force into O(n²) — two loops instead of three.

// public class PracticePrefix {
//     public static void Sumrange(int arr[]) {
//         int sum = 0;
//         int maxsum=Integer.MIN_VALULE;
//         int prefix[] = new int[arr.length];
//         prefix[0] = arr[0];
//         for(int i = 1; i < arr.length; i++) {
//             prefix[i] = prefix[i-1] + arr[i];
//         }
//         for(int i = 0; i < prefix.length; i++) {
//             int l = i;
//             for(int j = i; j < prefix.length; j++) {
//                 int r = j;
//                 sum = l == 0?prefix[r] : prefix[r] - prefix[l-1];
//                 if (sum > maxsum) { maxsum=sum;}
//             }

//         } System.out.println("Sum of range : " + maxsum );        
//     }


//     public static void main(String args[]) {
//         int number[] = {2, 4, 6, 8, 10};
//         Sumrange(number);
//     }
// }

// Given an array, find an index where the sum of elements 
// on the left equals the sum on the right (if one exists). 
// Good prefix-sum application problem.

public class PracticePrefix {
    public static void splitSum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int last = prefix.length;
        boolean found = false;

        for(int i = 1; i < last; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i < last; i++) {
            
            int leftSum = i==0 ? 0 : prefix[i - 1];
            int rightSum = prefix[last-1] - prefix[i];
            if(leftSum == rightSum) {
                System.out.print("Matched at index : "+i+" ");
                found = true;
            } 
        } if (!found) 
            {System.out.println("Not Found");}

    }


    public static void main(String args[]) {
        int numbers[] = {1,2,3,4,6};
        splitSum(numbers);
    }
}