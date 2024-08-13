package TwoDArray;

import java.util.Scanner;

public class Matrices {
    //seraching (optional)basic idea of how to search in 2D array
    public static boolean Search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
              
              if (matrix[i][j] == key) {
                
               System.out.print("Found at cell (" + i +"," + j+" )");
               return true;
            }
        }}
        System.out.println("Not Found at cell");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        //input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix ,5);
    }
}
