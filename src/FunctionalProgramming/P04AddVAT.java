package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> prices = Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble).collect(Collectors.toList());

        UnaryOperator<Double> price = e -> e * 1.2;
        System.out.printf("Prices with VAT:%n");
        Consumer<Double> print = e -> System.out.printf("%.2f%n", e);
        prices.forEach(e-> {
            Double apply = price.apply(e);
            print.accept(apply);
        });

    }
}
