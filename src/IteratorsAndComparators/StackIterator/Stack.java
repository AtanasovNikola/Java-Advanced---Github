package IteratorsAndComparators.StackIterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Stack<Integer> implements Iterable<Integer> {
    private List<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();

    }
    public boolean isEmpty(){
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }

    public void push(List<Integer> numbers) {

        stack.addAll(numbers);
    }

    public void pop() {
        if (stack.size() == 0) {
            throw new ArithmeticException("No elements");
        } else {
            Integer element = stack.get(stack.size() - 1);
            stack.remove(element);
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = stack.size() ;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }


            @Override
            public Integer next() {

                index--;
                return stack.get(index);
            }
        };
    }


}
