import java.util.*;

public class self {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num2 = sc.nextInt();

        System.out.println("Sum = "+ sum(num1,num2));        
    }
    public static int sum(int a, int b) {
        return a+b;
    }
}