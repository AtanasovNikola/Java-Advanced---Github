package Generics.GenericBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<E extends Comparable<E>> {
    private List<E> list;

    public Box() {
        this.list = new ArrayList<>();

    }

    public void add(E element) {
        list.add(element);
    }

    public void swap(int index1, int index2) {
        Collections.swap(list, index1, index2);
    }

    public int countGreater(E element) {
        int count = 0;
       for (E e:list){
           if (e.compareTo(element)>0){
               count++;
           }
       }
       return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E element : list) {
            sb.append(element.getClass()).append(": ").append(element).append("\n");
        }
        return sb.toString().replace("class ", "");
    }
}
