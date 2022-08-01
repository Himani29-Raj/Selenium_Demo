package library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public List<Book> search(String searchString) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book b : books) {
            if (b.getTittle().toUpperCase().contains(searchString.toUpperCase())
                    || b.getAuthor().toUpperCase().contains(searchString.toUpperCase())) {
                matchingBooks.add(b);
            }
        }
        return matchingBooks;
    }
    public void add(Book book) {
    books.add(book);
    }
}
