package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P09BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int numbersToPush = inputArr[0];
        int numbersToPop = inputArr[1];
        int containsNumber = inputArr[2];
        int [] elementsArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numbersToPush; i++) {
            stack.push(elementsArr[i]);
        }
        for (int i = 0; i <numbersToPop ; i++) {
            stack.pop();
        }
        if (stack.contains(containsNumber)){
            System.out.println("true");
        }else if (stack.isEmpty()) {
            System.out.println("0");
        }else{
            int smallest =Collections.min(stack);
            System.out.println(smallest);
        }
    }
}
