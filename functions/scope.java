public class scope{
 // method scope   
    public static void isPrint() {
int s = 45;
    }
    
    
    
    public static void main(String args[]) {
        // System.out.println(s);
        // int s = 45;
        System.out.println(s);
    }
int p = 10
    {
        int s = 45;
        System.out.println(s);
        System.out.println(p); // print ho skta h kyuki scope ke andar h 
    }
    System.out.println(s); // but yeh nhi ho skta bcs box scope ke bahar h
}

// block scope {}
// variables jo block ke andar aa jaye ussi ke andr reh skte h