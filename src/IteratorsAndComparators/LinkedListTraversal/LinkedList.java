package IteratorsAndComparators.LinkedListTraversal;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<Object> {
    private java.util.LinkedList<T> list;

    public LinkedList() {
        this.list = new java.util.LinkedList<T>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public Iterator<Object> iterator() {
        return new LinkedListIterator();
    }

    private final class LinkedListIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public T next() {
            T element = list.get(index);
            index++;
            return element;

        }
    }

}
