package Generics.Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        String firstName = input[0];
        String lastName = input[1];
        String town = input[2];
        Tuple<String, String> tuple1 = new Tuple<>(firstName + " " + lastName, town);

        String[] input2 = scanner.nextLine().split("\\s+");

        String name = input2[0];
        int litersOfBeer = Integer.parseInt(input2[1]);
        Tuple<String, Integer> tuple2 = new Tuple<>(name, litersOfBeer);

        String[] input3 = scanner.nextLine().split("\\s+");

        int num1 = Integer.parseInt(input3[0]);
        double num2 = Double.parseDouble(input3[1]);
        Tuple<Integer, Double> tuple3 = new Tuple<>(num1, num2);

        System.out.println(tuple1);
        System.out.println(tuple2);
        System.out.println(tuple3);
    }
}
