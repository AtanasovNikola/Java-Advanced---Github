package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P13MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] readMatrix = readMatrix(scanner);
        print(readMatrix);
    }

    private static void print(String[][] readMatrix) {
        int rows = readMatrix.length;
        int cols = readMatrix[0].length;
        for (int row = 0; row <rows ; row++) {
            for (int col = 0; col <cols ; col++) {
                System.out.print(readMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] readMatrix(Scanner scanner) {
        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] readMatrix = new String[inputArr[0]][inputArr[1]];
        for (int row = 0; row < inputArr[0]; row++) {
            char firstSymbol = (char) (97 + row);
            for (int col = 0; col < inputArr[1]; col++) {
                char secondSymbol = (char) (97 + row + col);
                readMatrix[row][col] = firstSymbol +""+ secondSymbol + firstSymbol ;
            }
        }
        return readMatrix;
    }
}
