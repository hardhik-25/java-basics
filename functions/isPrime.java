import java.util.*;

public static boolean isPrime(int n){
    // Corner Cases
    // 2
    // if (n == 2) {
    //     return true;
    // }
        
    // boolean isPrime = true;
    // for(int i = 2; i<=n-1; i++) {
    //     if(n % i == 0) {// completely dividing {
    //         isPrime = false;
    //         break;        
    //     }
    // }

    // Optimized version
    if(n == 2) {
        return true;
    }
    boolean isPrime = true;
    for(int i = 2; i <= Math.sqrt(n);i++) {
        if (n % i == 0) {
            return false;
        } 
    } return isPrime;
    
}
public static void main(String args[]) { 
    System.out.println(isPrime(10));
}