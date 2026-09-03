public class ReverseArr{
   public static int revarr(int array[]) {
    int first = 0;
    int last = array.length - 1;
    while (first < last) {
        // swap
        // ek value temporary box m store kra di aur dusri ko change krdiya with first
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;

        first++;
        last--;
        } return -1;
   }
   
   public static void main(String args[]) {
    int array[] = {2, 4, 6, 8, 10};
    
    revarr(array);

    //print
    for(int i = 0; i< array.length; i++) {
        System.out.print(array[i]+" "); 
    }
    System.out.println();
   } 
}