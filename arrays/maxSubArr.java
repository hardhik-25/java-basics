public class maxSubArr {
    public static void maxArr(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++) {
            for(int j = i; j < arr.length; j++) {
                int sum = 0;
                for(int k = i; k <= j; k++ ) {
                    sum += arr[k];
                    System.out.println(sum);
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            } 
        } System.out.println("max sum = "+maxSum);
    }
    
    public static void main(String args[]) {
        int number[] = {1, -2, 6, -1, 3};
        maxArr(number);
    }
}