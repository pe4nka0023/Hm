package model;

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
}
