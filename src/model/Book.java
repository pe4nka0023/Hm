package model;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String name;
    private int publishYear;

    public Book(Author author, String name, int publishYear) {
        this.author = author;
        this.name = name;
        this.publishYear = publishYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getPublishYear() == book.getPublishYear() && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getName(), book.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getName(), getPublishYear());
    }
}
