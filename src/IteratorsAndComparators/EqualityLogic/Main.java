package IteratorsAndComparators.EqualityLogic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        Set<Person> peopleTree = new TreeSet<>();
        Set<Person> peopleHash = new HashSet<>();
        while (numOfPeople-->0){
            String [] currentPerson = scanner.nextLine().split("\\s+");
            String name = currentPerson[0];
            int age = Integer.parseInt(currentPerson[1]);
            Person person = new Person(name,age);
            peopleTree.add(person);
            peopleHash.add(person);
        }

        System.out.println(peopleTree.size());
        System.out.println(peopleHash.size());
    }
}
