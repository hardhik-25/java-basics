public class GradeChecker {
    public static void main (String args[]) {
        int Grade = 76;
        if(Grade >= 90) {
            System.out.print("A");
        } else if(Grade >= 75) {
        System.out.print("B");
        } else if(Grade >= 50) {
            System.out.print("C");
        } else {
            System.out.print("Fail");
        }
    }
}