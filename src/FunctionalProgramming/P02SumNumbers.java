package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, String> count = list -> "Count = " + list.size();
        Function<List<Integer>, Integer> sum = e -> e.stream().reduce(0, Integer::sum);
        Function<Integer,String> sumFormatter = s-> "Sum = " + s;
        String countOutput = count.apply(input);
        System.out.println(countOutput);
        int sums = sum.apply(input);
        String sumOutput = sumFormatter.apply(sums);
        System.out.println(sumOutput);


    }
}
