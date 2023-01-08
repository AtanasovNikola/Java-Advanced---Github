package FunctionalProgramming;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] range = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String condition = scanner.nextLine();
        int down = range[0];
        int up = range[1]+1;

        System.out.println
                (IntStream.range(down, up)
                        .boxed()
                        .filter(getPredicate(condition))
                        .map(String::valueOf)
                        .collect(Collectors.joining(" ")));
    }

    private static Predicate<? super Integer> getPredicate(String condition) {
        if (condition.equals("odd")) {
            return e -> e % 2 != 0;
        }
        return e -> e % 2 == 0;
    }
}
