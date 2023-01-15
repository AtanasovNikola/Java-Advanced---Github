package Generics.Jar;

import java.util.ArrayDeque;


public class Jar<T> {
    private ArrayDeque<T> stack;

    public Jar() {
        this.stack = new ArrayDeque<>();
    }

    //void add(element)
    public void add(T element) {
        stack.push(element);
    }

    //element remove
    public void remove() {
        stack.pop();
    }

    public static String clazz(String type) {
        return type;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String print() {
        if (!isEmpty()) {
            return stack.toString();
        } else {
            return "The stack is empty!";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : stack) {
            sb.append(t).append(" ");
        }
        return sb.toString();
    }

}
