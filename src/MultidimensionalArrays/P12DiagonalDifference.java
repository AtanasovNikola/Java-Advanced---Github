package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P12DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(size, scanner);
        int sumPrimary = sumPrimaryDiagonal(matrix, size);
        int sumSecondary = sumSecondaryDiagonal(matrix, size);
        System.out.println(Math.abs(sumPrimary-sumSecondary));
    }

    private static int sumPrimaryDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col) {
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int sumSecondaryDiagonal(int[][] matrix, int size) {
        int sum = 0;
        int col = 0;
        for (int row = size - 1; row >= 0; row--) {
            sum += matrix[row][col];
            col++;
        }
        return sum;
    }

    private static int[][] readMatrix(int size, Scanner scanner) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            int[] rowArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = rowArr[col];
            }
        }
        return matrix;
    }
}
