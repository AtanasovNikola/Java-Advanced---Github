package IteratorsAndComparators.StrategyPattern;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.age - person2.age;
    }
}
