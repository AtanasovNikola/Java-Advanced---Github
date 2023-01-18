package IteratorsAndComparators.Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersOfLake = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).toList();

        Lake lake = new Lake(numbersOfLake);
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
List<String> list = new ArrayList<>();
        for (Integer integer : lake) {
           list.add(integer + "");
        }
        System.out.println(String.join(", ", list));
    }
}
