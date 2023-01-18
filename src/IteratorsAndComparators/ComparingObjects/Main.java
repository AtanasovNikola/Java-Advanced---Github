package IteratorsAndComparators.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        while (!command.equals("END")) {
            String[] currentPerson = command.split("\\s+");
            String name = currentPerson[0];
            int age = Integer.parseInt(currentPerson[1]);
            String town = currentPerson[2];
            Person person = new Person(name, age, town);
            people.add(person);
            command = scanner.nextLine();
        }
        int indexOfPersonToCompare = Integer.parseInt(scanner.nextLine());
        Person personToCompare = people.get(indexOfPersonToCompare - 1);
        int equalPeople = 0;
        int notEqualPeople = 0;
        int totalPeople = people.size();
        for (Person person : people) {
            if (personToCompare.compareTo(person) == 0) {
                equalPeople++;
            } else {
                notEqualPeople++;
            }
        }
        if (equalPeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", equalPeople, notEqualPeople, totalPeople);
        }
    }
}