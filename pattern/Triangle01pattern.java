public class Triangle01pattern {
    public static void main(String args []) {
        int n = 5;
        int count = 1;
        int zero = 0;
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (n%i != 0) {
                    System.out.print(count);
                } else { System.out.print(zero);}
            } System.out.println();
         }
    }
}