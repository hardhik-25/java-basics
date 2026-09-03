import java.util.*;
// use of helper function
public class isPrimeN{
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n==2) {
            return true;
        }
        for(int i = 2; i<= Math.sqrt(n);i++) {
            if (n % i == 0) {
                return false;
            }
        } return isPrime;
    }


    public static void primeInRange(int n) {
        for (int i = 2; i<= n; i++) {
            if (isPrime(i)) {// true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
          primeInRange(50); // 2 to 20
    }
}