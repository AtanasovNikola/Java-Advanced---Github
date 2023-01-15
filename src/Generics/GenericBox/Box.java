package Generics.GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<E> {
    private List<E> list;

    public Box() {
        this.list = new ArrayList<>();

    }

    public void add(E element) {
        list.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E element : list) {
            sb.append(element.getClass()).append(": ").append(element).append("\n");
        }
        return sb.toString().replace("class ","");
    }
}
