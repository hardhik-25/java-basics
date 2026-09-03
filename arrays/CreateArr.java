import java.util.*;
public class CreateArr{
    // creating an array
    // public static void main(String args[]) {
    //     int marks[] = new int[25];
    
        // int numbers[] = {1, 2, 3};

        // int moreNumbers[] = {4, 5, 6};

        // String fruits[] = {"apple", "mango", "orange"};

        // Input in arrays
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy : " + marks[0]);
        // System.out.println("chem : " + marks[1]);
        // System.out.println("maths : " + marks[2]);

        // // updation
        // marks[2] = marks[2] + 1;
        // System.out.println("maths : " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage = " + percentage + "%");
        
        
        // length of marks
        // System.out.println("Length of array : "+ marks.length);
    // }
    public static void update(int marks[], int nonchangeable) {
        nonchangeable = 10;
        for( int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = {98,94,91};
        int nonchangeable = 5;
        System.out.println(nonchangeable);
        update(marks, nonchangeable);

        //print our marks
        for(int i = 0; i< marks.length; i++) {
            System.out.print(marks[i] + " ");
        } System.out.println();
    }
} 