package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(size, scanner);
        printDiagonals(matrix, size);
        printReversedDiagonals(matrix, size);
    }

    private static void printReversedDiagonals(int[][] matrix, int size) {
        int counter = 0;
        for (int row = size - 1; row >= 0; row--) {
            System.out.print(matrix[row][counter] + " ");
            counter++;
        }
    }

    public static void printDiagonals(int[][] matrix, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();
    }

    private static int[][] readMatrix(int size, Scanner scanner) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = currentRow[col];
            }
        }
        return matrix;
    }
}

