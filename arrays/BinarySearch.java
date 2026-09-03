public class BInarySearch{
    public static int binarysearch(int array[], int key) {
    // only works if arrays are sorted
    // acc to pseudo code
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {// = isliyw when our start, mid & end will only one value
        int mid = (start + end)/2;

        // Comparisons
        if (array[mid] == key) {
            return mid;
        }
        if (array[mid] > key) { // check left side
            end = mid - 1;
        } else { // check right side
            start = mid + 1; 
        }
    } return -1;

}
    
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 20; 

    System.out.println("Index for key is : "+binarysearch(numbers, key));
    }
}