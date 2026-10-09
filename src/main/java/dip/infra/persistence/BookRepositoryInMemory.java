package dip.infra.persistence;

import dip.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryInMemory {
    public static List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
