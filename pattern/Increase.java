import java.util.*;
// public class increase{
//     public static void main(String args[]) {
//         int n = 7;
//         for(int i = 1; i<=n; i++) {
//             for(int j = 1; j<=i; j++) {
//                 System.out.print(j);
//             }
//             for(int k = i-1; k>=1; k--) {
//             System.out.print(k);
//         }
//         System.out.println();
//         }   
//     }
// }

// public class increase {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             for (int i = n; i>=1; i--) {
//                 for (int j = n; j>=i; j--) {
//                     System.out.print(j);
//                 }
//                 for (int k = i+1; k<=n; k++){
//                     System.out.print(k);
//                 }
//                 System.out.println();
//             }
        
//     }
// }

public class increase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 1; i<=n; i++) {
                for (int j = i; j>=1; j--) {
                    System.out.print(j);
                }
                for (int k = 2; k<=i; k++){
                    System.out.print(k);
                }
                System.out.println();
            }       
    }
}