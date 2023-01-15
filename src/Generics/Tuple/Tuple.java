package Generics.Tuple;

public class Tuple<T, E> {
    private T type;
    private E element;

    public Tuple(T type, E element) {
        this.type = type;
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", type, element);
    }
}
