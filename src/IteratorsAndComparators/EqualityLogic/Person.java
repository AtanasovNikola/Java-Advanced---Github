package IteratorsAndComparators.EqualityLogic;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        int result = this.name.compareTo(other.name);
        if (result == 0) {
            return this.age - other.age;
        }
        return result;
    }

    @Override
    public boolean equals(Object object) {

        Person human = (Person) object;

        if (human.getAge() == age && human.getName().equals(name))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int value;
        value = age + name.hashCode();

        return value;
    }
}

