package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> collect = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        String output = collect.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(output);

        String output2 = collect.stream().sorted().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(output2);
    }
}
