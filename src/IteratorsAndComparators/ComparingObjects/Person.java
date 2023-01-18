package IteratorsAndComparators.ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }


    @Override
    public int compareTo(Person other) {
        int result = this.name.compareTo(other.name);
        if (result == 0) {
            if (this.age == other.age) {
                if (this.town.compareTo(other.town) == 0) {
                    return result;
                }
                return this.town.compareTo(other.town);
            }
            return (this.age) - (other.age);
        }
        return result;
    }
}
