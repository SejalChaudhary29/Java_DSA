package TwoDArray;

public class SearchSortedMatrix {
    //staricase approach O(n +m);
    public static boolean staireCaseSearch(int matrix [][] , int key ){

    int row = 0 , cols = matrix[0].length-1;
    //  // n = row and m = cols => ( 0 to m-1)
    while (row < matrix.length && cols >= 0) {
        
        if (matrix[row][cols]== key) {
            System.out.println( "found key at ("+ row + "," + cols + ")");
            return true;

        }
        else if( key < matrix[row][cols]){
            cols--;
        }
        else{
            row++;
        }
    }
    System.out.println("key not found");
    return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };
    int key = 13;
    staireCaseSearch(matrix, key); //found key at (3,0)

    }
}
