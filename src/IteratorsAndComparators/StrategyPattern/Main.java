package IteratorsAndComparators.StrategyPattern;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        Set<Person> people = new TreeSet<>();

        while (numOfPeople-- > 0) {
            String[] currentPerson = scanner.nextLine().split("\\s+");
            String name = currentPerson[0];
            int age = Integer.parseInt(currentPerson[1]);
            Person person = new Person(name, age);
            people.add(person);
        }
        people.stream().sorted(new ComparatorByName())
                .forEach(System.out::println);
        people.stream().sorted(new ComparatorByAge())
                .forEach(System.out::println);
    }
}
