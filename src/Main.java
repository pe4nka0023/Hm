import model.Author;
import model.Book;


public class Main {
    public static void main(String[] args) {
        Author author = new Author("Фёдор", "Достоевский");
        Book book = new Book(author, "Преступление и наказание", 1866);
        book.setPublishYear(1899);
    }
}