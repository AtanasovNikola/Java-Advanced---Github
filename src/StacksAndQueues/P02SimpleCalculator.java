package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> queueNumbers = new ArrayDeque<>();
        ArrayDeque<String> queueOperators = new ArrayDeque<>();
        for (int index = 0; index < input.length; index++) {
            String currentSymbol = input[index];
            if (currentSymbol.equals("+") || currentSymbol.equals("-")) {
                queueOperators.offer(currentSymbol);
            } else {
                queueNumbers.offer(Integer.parseInt(currentSymbol));
            }
        }
        int sum =queueNumbers.poll();
        for (String queueOperator : queueOperators) {
            if (queueOperator.equals("+")) {
                sum +=queueNumbers.poll();
            }else {
sum -= queueNumbers.poll();
            }
        }
        System.out.println(sum);
    }
}
