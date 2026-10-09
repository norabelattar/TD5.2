package dip.domain;

public interface BookRepository {
    void add(Book book);
    Book findByTitle(String title);
}
