package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P11MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(inputArr[0]);
        int cols = Integer.parseInt(inputArr[1]);
        int[][] matrix = readMatrix(rows, cols, scanner);
        int sum = sum(matrix, rows, cols);
        System.out.printf("Sum = %d%n", sum);
        int[][] matrix3x3 = matrix3x3(matrix, rows, cols);
        printMatrix3x3(matrix3x3);
    }

    private static void printMatrix3x3(int[][] matrix3x3) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.print(matrix3x3[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] matrix3x3(int[][] matrix, int rows, int cols) {
        int sum = 0;
        int biggestSum = Integer.MIN_VALUE;
        int[][] matrix3x3 = new int[3][3];
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                sum = matrix[row][col] + matrix[row + 1][col] + matrix[row + 2][col]
                        + matrix[row][col + 1] + matrix[row + 1][col + 1] + matrix[row + 2][col + 1]
                        + matrix[row][col + 2] + matrix[row + 1][col + 2] + matrix[row + 2][col + 2];
                if (sum > biggestSum) {
                    biggestSum = sum;
                    matrix3x3[0][0] = matrix[row][col];
                    matrix3x3[0][1] = matrix[row][col + 1];
                    matrix3x3[0][2] = matrix[row][col + 2];
                    matrix3x3[1][0] = matrix[row + 1][col];
                    matrix3x3[1][1] = matrix[row + 1][col + 1];
                    matrix3x3[1][2] = matrix[row + 1][col + 2];
                    matrix3x3[2][0] = matrix[row + 2][col];
                    matrix3x3[2][1] = matrix[row + 2][col + 1];
                    matrix3x3[2][2] = matrix[row + 2][col + 2];
                }

            }
        }
        return matrix3x3;
    }


    private static int sum(int[][] matrix, int rows, int cols) {
        int sum = 0;
        int biggestSum = Integer.MIN_VALUE;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                sum = matrix[row][col] + matrix[row + 1][col] + matrix[row + 2][col]
                        + matrix[row][col + 1] + matrix[row + 1][col + 1] + matrix[row + 2][col + 1]
                        + matrix[row][col + 2] + matrix[row + 1][col + 2] + matrix[row + 2][col + 2];
                if (sum > biggestSum) {
                    biggestSum = sum;
                }

            }
        }
        return biggestSum;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] inputRowArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = inputRowArr[col];
            }
        }
        return matrix;
    }
}
