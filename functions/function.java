import java.util.*;
public class function {
    public static int printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 1;
    }

// public static void calculateSum(int num1, int num2) {
//         int sum = num1 + num2;
//         // System.out.println("Sum is : "+ sum);
// }
    
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//     calculateSum(a, b);   
//     }
// }


public static int calculateSum(int num1, int num2) {// parameters or formal parameters
        int sum = num1 + num2;
        // System.out.println("Sum is : "+ sum);
        return sum;
}

public static void swap(int n1, int n2) {
    int temp = n1;
    n1 = n2;
    n2 = temp;

}
    
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); // arguments or actual paraments
        // System.out.println("Sum is : "+ sum);  

        //swap - values exchange
        int a = 5;
        int b = 10;
        swap(a, b);
        // System.out.println("a = "+a+" b = "+ b);

 
    }
}