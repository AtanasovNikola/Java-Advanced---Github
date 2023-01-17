package IteratorsAndComparators.ListyIterator;

import java.util.Arrays;

import java.util.List;

public class ListyIterator {
    List<String> elements;
    int currentIndex;

    public ListyIterator(String... strings) {
        this.elements = Arrays.asList(strings);
        currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < elements.size() - 1;
    }

    public boolean move() {
        if (hasNext()) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println(this.elements.get(currentIndex));
    }

    public  void printAll(){
        String join = String.join(" ", elements);
        System.out.println(join);
    }
}
