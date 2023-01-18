package IteratorsAndComparators.Froggy;


import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private List<Integer> list;

    public Lake(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }
    class Frog implements Iterator<Integer>{
            int index = 0;
            boolean firstRoundFinished = false;

            @Override
            public boolean hasNext() {
              return index<list.size();

            }

            @Override
            public Integer next() {
                int currentIndex = index;
                index += 2;
                if (index>=list.size() && !firstRoundFinished){
                    index = 1;
                    firstRoundFinished= true;
                }
                return list.get(currentIndex);
            }
        };


    @Override
    public String toString() {
        return String.join(", ", (CharSequence) this.list);
    }
}

