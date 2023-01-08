package MultidimensionalArrays;

import java.util.*;

public class P05MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = inputArr[0];
        int cols = inputArr[1];
        int[][] matrix = readMatrix(rows, cols, scanner);
        printMatrix(matrix, rows, cols);
        int result = sumOfBiggestMatrix(matrix, rows, cols);
        System.out.println(result);
    }

    private static void printMatrix(int[][] matrix, int rows, int cols) {
        int sum = 0;
        int biggestSum = Integer.MIN_VALUE;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > biggestSum) {
                    biggestSum = sum;
                    if (!queue.isEmpty()) {
                        queue.poll();
                        queue.poll();
                        queue.poll();
                        queue.poll();
                        queue.offer(matrix[row][col]);
                        queue.offer(matrix[row][col + 1]);
                        queue.offer(matrix[row + 1][col]);
                        queue.offer(matrix[row + 1][col + 1]);
                    }else{
                        queue.offer(matrix[row][col]);
                        queue.offer(matrix[row][col + 1]);
                        queue.offer(matrix[row + 1][col]);
                        queue.offer(matrix[row + 1][col + 1]);
                    }
                }
            }
        }
        System.out.printf("%d %d%n", queue.poll(),queue.poll());
        System.out.printf("%d %d%n", queue.poll(),queue.poll());
    }

    private static int sumOfBiggestMatrix(int[][] matrix, int rows, int cols) {
        int sum = 0;
        int biggestSum = Integer.MIN_VALUE;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
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
            int[] currentRow = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = currentRow[col];
            }
        }
        return matrix;
    }
}
