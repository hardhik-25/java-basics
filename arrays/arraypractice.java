public class arraypractice {
    public static void main(String args[]) {
        int grid[][] = { {1,2,10},
                         {4,5,6},
                         {7,10,9} };
        int k = 0;
        for (int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++) {
                k += 1;
                System.out.print(grid[i][j]+ " ");
            } System.out.println();
        }   
    }
}