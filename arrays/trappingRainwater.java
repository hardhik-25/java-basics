import java.util.*;

public class trappingRainwater{
    public static void TrappedWater(int height[]) {
        int width = 1; 
        int tw = 0;
        int wl = 0;
        // EDGE CASES
        // if(height.length == 1) {
        //     tw = 0;}

        // LEFTMAX BOUNDARY
         int leftmax[] = new int[height.length];
         leftmax[0] = height[0];
         for( int i = 1; i < leftmax.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);           
         }
        // RightMAX BOUNDARY
         int rightmax[] = new int[height.length];
         rightmax[height.length - 1] = height[height.length - 1];
         for(int i = rightmax.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
         }

         for(int i = 0; i < height.length; i++){
            wl = Math.min(leftmax[i], rightmax[i]);
            tw += (wl - height[i]) * 1;

         } System.out.println("Total Trapped RainWater : " + tw);

    }
    public static void main(String args[]) {
    int height[] ={4, 2, 0, 6, 3, 5};
        TrappedWater(height);
    }
}