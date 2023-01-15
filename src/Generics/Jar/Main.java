package Generics.Jar;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfInputs = Integer.parseInt(scanner.nextLine());

        Jar<Character> characterJar = new Jar<>();
        Jar<String> stringJar = new Jar<>();
        Jar<Double> doubleJar = new Jar<>();
        Jar<Integer> integerJar = new Jar<>();
        while (numOfInputs-- > 0) {
            String type = Jar.clazz(scanner.nextLine());

            String element = scanner.nextLine();
            switch (type) {
                case "String":
                    stringJar.add(element);
                    break;
                case "Double":
                    doubleJar.add(Double.parseDouble(element));
                    break;
                case "Integer":
                    integerJar.add(Integer.parseInt(element));
                    break;
                case "Character":
                    characterJar.add(element.charAt(0));
                    break;
            }
        }
        System.out.println(stringJar);
        System.out.println(doubleJar);
        System.out.println(integerJar);
        System.out.println(characterJar);
    }
}
