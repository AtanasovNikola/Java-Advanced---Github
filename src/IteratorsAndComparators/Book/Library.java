package IteratorsAndComparators.Book;

import java.util.Arrays;
import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;



    public Book[] getBooks() {
        return books;
    }


    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    private final class LibraryIterator implements Iterator  {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return counter< books.length;
        }

        @Override
        public Book next() {

            Book book = getBooks()[counter];
            counter++;
            return book;
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
