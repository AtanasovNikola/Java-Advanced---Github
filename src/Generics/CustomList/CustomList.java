package Generics.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public void swap(int index1, int index2) {
        Collections.swap(list, index1, index2);
    }

    public int greater(T element) {
        int count = 0;
        for (T t : list) {
            if (t.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public void max() {
        System.out.println(list.stream().max(Comparator.naturalOrder()).get());
    }

    public void min() {
        System.out.println(list.stream().min(Comparator.naturalOrder()).get());
    }
    public void print(){
        list.forEach(System.out::println);
    }
}
