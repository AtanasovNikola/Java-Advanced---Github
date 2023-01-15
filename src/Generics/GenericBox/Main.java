package Generics.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLines = Integer.parseInt(scanner.nextLine());
        Box<String> stringBox = new Box<>();

        while (inputLines-- > 0) {
            String input = scanner.nextLine();
            stringBox.add(input);
        }
        System.out.println(stringBox);
    }
}
