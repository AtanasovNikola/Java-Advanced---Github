package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(rows, scanner);
        int[] wrongElement = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int wrongRow = wrongElement[0];
        int wrongCol = wrongElement[1];
        int[][] correctMatrix = correctMatrix(matrix, rows, matrix[0].length, wrongRow, wrongCol);
        printMatrix(correctMatrix, rows, correctMatrix[0].length);
    }

    private static void printMatrix(int[][] correctMatrix, int rows, int length) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < length; col++) {
                System.out.print(correctMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] correctMatrix(int[][] matrix, int rows, int length, int wrongRow, int wrongCol) {
        int[][] correctMatrix = new int[rows][length];
        int wrongNumber = matrix[wrongRow][wrongCol];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < length; col++) {
                if (matrix[row][col]==wrongNumber) {
                    int sum = 0;
                    // up
                    if (row != 0) {
                        if (matrix[row-1][col]!=wrongNumber){
                            sum += matrix[row - 1][col];
                        }
                    }
                    //down
                    if (row != rows - 1) {
                        if (matrix[row+1][col]!=wrongNumber){
                            sum += matrix[row + 1][col];
                        }
                    }
                    //left
                    if (col != 0) {
                        if (matrix[row][col-1]!=wrongNumber){
                            sum += matrix[row][col - 1];
                        }
                    }
                    //right
                    if (col != length - 1) {
                        if (matrix[row][col + 1]!=wrongNumber){
                            sum += matrix[row][col + 1];

                        }
                    }
                    correctMatrix[row][col] = sum;
                } else {
                    correctMatrix[row][col] = matrix[row][col];
                }
            }
        }

        return correctMatrix;
    }


    private static int[][] readMatrix(int rows, Scanner scanner) {
        String [] inputRow = scanner.nextLine().split("\\s+");
        int[][] matrix = new int[rows][inputRow.length];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < inputRow.length; col++) {
                matrix[row][col] = Integer.parseInt(inputRow[col]);
            }
            if (row+1!=rows) {
                inputRow = scanner.nextLine().split("\\s+");
            }
        }
        return matrix;
    }
}
