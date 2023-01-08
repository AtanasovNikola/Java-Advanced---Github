package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = inputArr[0];
        int cols = inputArr[1];
        int[][] matrix = readMatrix(rows, cols, scanner);
        System.out.println(rows);
        System.out.println(cols);
        int sum = sumMatrix(rows, cols, matrix);
        System.out.println(sum);
    }

    private static int sumMatrix(int rows, int cols, int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = currentRow[col];
            }
        }
        return matrix;
    }

}

