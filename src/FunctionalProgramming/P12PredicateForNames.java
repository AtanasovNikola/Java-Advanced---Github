package FunctionalProgramming;


import java.util.Arrays;
import java.util.Scanner;


public class P12PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");
        Arrays.stream(names).filter(e-> e.length()<=length).forEach(System.out::println);
    }
}
