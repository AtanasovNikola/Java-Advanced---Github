package IteratorsAndComparators.StackIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine().replace(",", "");
        Stack<Integer> stack = new Stack<>();
        while (!command.equals("END")) {
            String[] commandPart = command.split("\\s+");
            String commandName = commandPart[0];
            switch (commandName) {
                case "Push":
                    List<Integer> collect = Arrays.stream(Arrays.copyOfRange(commandPart, 1, commandPart.length))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList());
                    stack.push(collect);
                    break;
                case "Pop":
                    try {

                    stack.pop();
                    }catch (ArithmeticException e){


                    }
                    break;
            }
            command = scanner.nextLine();
        }
        if (stack.isEmpty()){
            System.out.println("No elements");
        }
        for (int i = 0; i < 2; i++) {

            try {

                for (Integer integer : stack) {

                    System.out.println(integer);

                }
            } catch (IndexOutOfBoundsException e) {

            }
        }

    }
}
