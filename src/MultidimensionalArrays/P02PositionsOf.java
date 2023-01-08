package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read from the console
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = arr[0];
        int cols = arr[1];
        int[][] matrix = readMatrix(rows, cols, scanner);

        int number = Integer.parseInt(scanner.nextLine());
        // iterate matrix and check if contains the number
        existNumber(matrix, number, rows, cols);


    }

    private static void existNumber(int[][] matrix, int number, int rows, int cols) {
        boolean exist = false;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == number) {
                    System.out.println(row + " " + col);
                    exist=true;
                }
            }
        }
        if (!exist){
            System.out.println("not found");
        }
    }


    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] currentRowInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = currentRowInput[col];
            }
        }
        return matrix;
    }
}
