package TwoDArray;

public class DiagonalSum {
    public static int DiagonalSum(int matrix[][]) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Primary diagonal
            if (i != matrix.length - 1 - i) { // Secondary diagonal, avoid double-counting center element
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int result = DiagonalSum(matrix);
        System.out.println("The sum of the diagonals is: " + result);
    }
}
