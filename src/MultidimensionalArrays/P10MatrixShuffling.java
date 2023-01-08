package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P10MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = matrixSize[0];
        int cols = matrixSize[1];
        String[][] matrix = readMatrix(rows, cols, scanner);
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("END")) {
            boolean isValid = isValid(rows, cols, command);
            if (!isValid) {
                System.out.println("Invalid input!");
            } else {
                matrix = newMatrix(matrix, rows, cols, command);
                printMatrix(matrix, rows, cols);

            }
            command = scanner.nextLine().split("\\s+");

        }
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValid(int rows, int cols, String[] command) {
        if (!command[0].equals("swap")){
            return false;
        }
        int firstRowToSwap = Integer.parseInt(command[1]);
        int firstColToSwap = Integer.parseInt(command[2]);
        int secondRowToSwap = Integer.parseInt(command[3]);
        int secondColToSwap = Integer.parseInt(command[4]);
        if (firstRowToSwap < rows && secondRowToSwap < rows && firstColToSwap < cols && secondColToSwap < cols) {
            return true;
        } else {
            return false;
        }
    }

    private static String[][] newMatrix(String[][] matrix, int rows, int cols, String[] command) {

        int firstRowToSwap = Integer.parseInt(command[1]);
        int firstColToSwap = Integer.parseInt(command[2]);
        int secondRowToSwap = Integer.parseInt(command[3]);
        int secondColToSwap = Integer.parseInt(command[4]);
        String[][] printMatrix = new String[rows][cols];


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstRowToSwap == row && firstColToSwap == col) {
                    printMatrix[row][col] = matrix[secondRowToSwap][secondColToSwap];
                } else if (secondRowToSwap == row && secondColToSwap == col) {
                    printMatrix[row][col] = matrix[firstRowToSwap][firstColToSwap];

                } else {
                    printMatrix[row][col] = matrix[row][col];
                }
            }
        }

        return printMatrix;
    }

    private static String[][] readMatrix(int rows, int cols, Scanner scanner) {
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = inputRow[col];
            }
        }
        return matrix;
    }
}
