package dip.application;

import dip.domain.Book;
import dip.domain.BookRepository;
import dip.domain.Uploader;

public class BookService {
    private BookRepository bookRepository;
    private Notifier notifier;
    private BookAssembler bookAssembler;
    private Uploader uploader;

    public BookService(
            BookRepository bookRepository,
            Notifier notifier,
            Uploader uploader,
            BookAssembler bookAssembler
    ) {
        this.bookRepository = bookRepository;
        this.notifier = notifier;
        this.uploader = uploader;
        this.bookAssembler = bookAssembler;
    }

    public void addBook(BookDto newBookDto) {
        if (bookRepository.findByTitle(newBookDto.title) != null) {
            notifier.notify("The book " + newBookDto.title + " was already added.");
        } else {
            Book newBook = bookAssembler.fromDto(newBookDto, uploader);
            bookRepository.add(newBook);
        }
    }
}
