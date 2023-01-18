package IteratorsAndComparators.StrategyPattern;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.age);
    }
}
