public static int factorial(int n) {
int fact = 1;
for(int i = 1; i <= n; i++) {   
    fact *= i;
    } return fact; //factorial of n
}
public static void main(String args[]){
    // int result = factorial(5);
    System.out.println(factorial(7));
}