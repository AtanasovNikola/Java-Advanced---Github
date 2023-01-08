package MultidimensionalArrays;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P09StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rotation = scanner.nextLine().replace("Rotate(", "");
        rotation = rotation.replace(")", "");
        char[][] matrix = readMatrix(scanner);
        rotatedMatrix(matrix, Integer.parseInt(rotation), matrix.length, matrix[0].length);
    }

    private static void rotatedMatrix(char[][] matrix, int rotation, int rows, int cols) {

        rotation = rotation % 360;
        switch (rotation) {
            //col++ , row--;
            case 90:
                for (int col = 0; col <cols ; col++) {
                    for (int row = rows-1; row >=0 ; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            //row-- , col--
            case 180:
                for (int row = rows-1; row >=0 ; row--) {
                    for (int col = cols-1; col >=0 ; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            //col-- , row++
            case 270:
                for (int col = cols-1; col >=0 ; col--) {
                    for (int row = 0; row <rows ; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }

                break;
            // no rotation ;
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print( matrix[row][col] );
                    }
                    System.out.println();
                }
                break;
        }
    }

    public static char[][] readMatrix(Scanner scanner) {
// read the input;
        String input = scanner.nextLine();
        ArrayDeque<String> allMatrix = new ArrayDeque<>();
        int counterElements = 0;
// iterate all inputs and add them to the list to check which one is the longest;
        while (!input.equals("END")) {
            counterElements++;
            allMatrix.offer(input);
            input = scanner.nextLine();
        }
        //check which is the longest and create matrix to its length;
        String longestWord = "";
        for (String matrix : allMatrix) {
            if (matrix.length() > longestWord.length()) {
                longestWord = matrix;
            }
        }
        // read the matrix;
        char[][] currentMatrix = new char[counterElements][longestWord.length()];
        for (int row = 0; row < counterElements; row++) {
            String currentRow = allMatrix.poll();
            int lengthOfTheWord = currentRow.length();
            for (int col = 0; col < longestWord.length(); col++) {
                if (lengthOfTheWord > col) {
                    char currentSymbol = currentRow.charAt(col);
                    currentMatrix[row][col] = currentSymbol;
                } else {
                    currentMatrix[row][col] = ' ';
                }
            }
        }
        return currentMatrix;
    }
}
