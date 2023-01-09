package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P13FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Function<List<Integer>, Integer> function = list -> {
            int minElement = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int index = 0; index < list.size(); index++) {
                if (list.get(index) <= minElement) {
                    minElement = list.get(index);
                    minIndex = index;
                }
            }
            return minIndex;
        };
        Integer integer = function.apply(numbers);
        Consumer<Integer> print = System.out::println;
        print.accept(integer);
    }
}
