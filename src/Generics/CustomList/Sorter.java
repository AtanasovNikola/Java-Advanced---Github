package Generics.CustomList;

import java.util.Comparator;
import java.util.List;

public class Sorter<T extends Comparable<T>> {
    private CustomList<T> list;



    public static <T extends Comparable<T>> void sort(List<T> list) {
        list.sort(Comparator.naturalOrder());
    }
}
