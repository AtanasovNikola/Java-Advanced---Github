package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P10AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        UnaryOperator<List<Integer>> addFunction = numList -> numList.stream().map(el -> el + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunction = numList -> numList.stream().map(el -> el - 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunction = numList -> numList.stream().map(el -> el * 2).collect(Collectors.toList());
        Consumer<Integer> printer = e -> System.out.printf("%d ", e);
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    list = addFunction.apply(list);
                    break;
                case "subtract":
                    list = subtractFunction.apply(list);
                    break;
                case "multiply":
                    list = multiplyFunction.apply(list);
                    break;
                case "print":
                    list.forEach(printer);
                    System.out.println();
                    break;

            }
            command = scanner.nextLine();
        }
    }
}
