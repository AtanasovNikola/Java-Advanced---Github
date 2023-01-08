package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P11BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int numbersToPush = inputArr[0];
        int numbersToPop = inputArr[1];
        int containsNumber = inputArr[2];
        int [] elementsArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numbersToPush; i++) {
            queue.offer(elementsArr[i]);
        }
        for (int i = 0; i <numbersToPop ; i++) {
            queue.poll();
        }
        if (queue.contains(containsNumber)){
            System.out.println("true");
        }else if (queue.isEmpty()) {
            System.out.println("0");
        }else{
            int smallest = Collections.min(queue);
            System.out.println(smallest);
        }
    }
}
