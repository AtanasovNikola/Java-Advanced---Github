package IteratorsAndComparators.StrategyPattern;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int result = person1.name.length() - person2.name.length();
        if (result == 0) {
            return person1.name.compareTo(person2.name);
        }
        return result;
    }
}
