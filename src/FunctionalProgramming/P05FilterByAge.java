package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class P05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLines = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        while (numOfLines-- > 0) {
            String[] data = scanner.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            people.add(new Person(name, age));

        }
        String condition = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String outputFormat = scanner.nextLine();
        people = filterByAgeCondition(people, getPredicate(condition, ageFilter));
        Consumer<Person> printer = getPrinter(outputFormat);
        people.forEach(printer);
    }

    private static Consumer<Person> getPrinter(String outputFormat) {
        switch (outputFormat) {
            case "name":
                return p -> System.out.println(p.name);
            case "age":
                return p -> System.out.println(p.age);
            case "name age":
                return p -> System.out.println(p.name + " - " + p.age);
            default:
                throw new IllegalArgumentException("Unknown format " + outputFormat);
        }
    }

    private static Predicate<Person> getPredicate(String condition, int ageFilter) {
        if (condition.equals("younger")) {
            return p -> p.age <= ageFilter;
        } else if (condition.equals("older")) {
            return p -> p.age >= ageFilter;
        } else {
            throw new IllegalArgumentException("Invalid parameters for age predicate.");
        }
    }

    private static List<Person> filterByAgeCondition(List<Person> people, Predicate<Person> predicate) {
        return people.stream().filter(predicate).collect(Collectors.toList());
    }
}
