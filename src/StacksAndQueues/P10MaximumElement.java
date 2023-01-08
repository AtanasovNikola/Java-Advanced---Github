package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P10MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int command = 1; command <= commands; command++) {
            String[] currentCommand = scanner.nextLine().split("\\s+");
            switch (currentCommand[0]) {
                case "1":
                    stack.push(Integer.parseInt(currentCommand[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int biggest = Collections.max(stack);
                    System.out.println(biggest);
                    break;

            }
        }
    }
}
