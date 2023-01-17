package IteratorsAndComparators.Book;

import java.util.Arrays;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private String[] authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String... authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return String.format("Title: %s Year: %d Authors: %s", this.title, this.year,
                Arrays.toString(this.authors)
                        .replace("[", "")
                        .replace("]", ""));
    }


    @Override
    public int compareTo(Book other) {
        int result = this.title.compareTo(other.title);
        if (result == 0) {
            result = Integer.compare(this.year, other.year);
        }
        return result;
    }
}
