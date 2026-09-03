import java.util.*;

// public class functionspractice {
//     public static double average(double n1, double n2, double n3) { 
//         return (n1 + n2 + n3)/3;    
//     } 
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter no 1: ");
//         double n1 = sc.nextDouble();
//         System.out.print("Enter no 2: ");
//         double n2 = sc.nextDouble();
//         System.out.print("Enter no 3: ");
//         double n3 = sc.nextDouble();

//         System.out.println("Average of numbers : "+average(n1,n2,n3));
//     }
// }


// Even
// public class functionspractice {
//     public static boolean isEven(int n) {
//         // int isEven = false;
//         if(n % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         // System.out.print(isEven(2));
//         // Testing 
//         Scanner sc = new Scanner(System.in);
//         int num;
//         System.out.print("Enter the number ");
//         num = sc.nextInt();

//         if (isEven(num)) {
//             System.out.println("Number is Even");
//         } else {
//             System.out.println("Number is Odd");
//         }
//     }
// }

// public class functionspractice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the No to checker : ");
//         int number = sc.nextInt();
//      if (number == reverse(number)) {
//         System.out.print("It is a palindrome");
//      } else {
//         System.out.print("Not a Palindrome");
//      }
//     }
//     public static int reverse(int num) {
//         int rev = 0;
//         while(num>0){
//         int lastDigit = num % 10;
//         rev = rev*10 + lastDigit;
//         num /= 10;
//         } return rev;
//     }

// }

public class functionspractice {
    public static int totalSum(int number) {
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum += rem;
            number /= 10;
        } return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digits : ");
        int DigitSum = sc.nextInt();
        System.out.println("Sum of all Digits = "+totalSum(DigitSum));
    }
}