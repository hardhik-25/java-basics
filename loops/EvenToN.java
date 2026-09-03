import java.util.*;

public class EvenToN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            if (i%2 == 0) {
                count += 1;
            }
        } 
        System.out.print("count of even no : "); 
        System.out.print(count);
    }
}