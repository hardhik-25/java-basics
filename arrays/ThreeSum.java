import java.util.*;

public class ThreeSum {
   public static void triplet(int nums[]) {
    HashSet<String> seen = new HashSet<>();
    for(int i = 0 ; i < nums.length; i++) {
        for(int j = i+1; j < nums.length; j++) {
            for(int k = j+1; k < nums.length; k++) {
                if(nums[i]+nums[j]+nums[k]==0) {
                    int temp[] = {nums[i],nums[j],nums[k]};
                    Arrays.sort(temp);
                    String key = Arrays.toString(temp); //converted to String
                    
                    if (seen.add(key)) {
                        System.out.print(key + " ");
                    }

                }
               
            }
        }
     }
   }
    
    public static void main(String args[]) {
        int nums[] = {-1, 0,  1, 2, -1, -4};
        triplet(nums);
    }
}