package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = new int[rows][cols];

        matrixMethod(matrix, rows, cols, scanner);
        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows2 = input2[0];
        int cols2 = input2[1];
        int[][] matrix2 = new int[rows2][cols2];
        matrixMethod(matrix2, rows2, cols2, scanner);
        if (isEqual(matrix, matrix2, cols,cols2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    private static int[][] matrixMethod(int[][] matrix, int rows, int cols, Scanner scanner) {

        for (int row = 0; row < rows; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = currentRow[col];
            }
        }
        return matrix;
    }

    private static boolean isEqual(int[][] matrix1, int[][] matrix2 , int cols,int cols2) {

        if (matrix1.length == matrix2.length && cols==cols2) {

            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col <cols ; col++) {
                    if (matrix1[row][col] != matrix2[row][col]){
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
