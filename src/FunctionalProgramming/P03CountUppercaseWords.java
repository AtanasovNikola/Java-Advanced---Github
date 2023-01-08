package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Predicate<String> isUpperCase = e -> Character.isUpperCase(e.charAt(0));
        List<String> stringList = Arrays.stream(input).filter(e -> isUpperCase.test(e)).collect(Collectors.toList());
        System.out.println(stringList.size());
        stringList.forEach(System.out::println);
    }
}
