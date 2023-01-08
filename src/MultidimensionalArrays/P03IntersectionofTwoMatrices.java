package MultidimensionalArrays;

import java.util.Scanner;

public class P03IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read rows and cols
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        //create char matrix A and B (same size)
        char[][] a = readMatrix(rows, cols, scanner);
        char[][] b = readMatrix(rows, cols, scanner);

        //check if same , if not replace with '*' and print
        print(a, b, rows, cols);


    }

    private static void print(char[][] a, char[][] b, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (a[row][col] != b[row][col]) {
                    System.out.print('*');
                    System.out.print(' ');
                } else {
                    System.out.print(a[row][col]);
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            char[] currentRowArray = scanner.nextLine().replaceAll(" ","").toCharArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = currentRowArray[col];
            }
        }
        return matrix;
    }
}
