import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int num[]) {
        for(int turn=0; turn < num.length-1; turn++) {
            for(int j = 0; j < num.length - 1 - turn; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        } 
    }
    public static void print(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    System.out.println();
    }

    public static void main(String args[]) {            
    int nums[] = {5, 4, 3, 2, 1};
    bubbleSort(nums);
    print(nums);
    }
}