package dip.application;

import dip.api.BookDto;
import dip.domain.Book;
import dip.infra.persistence.BookRepositoryInMemory;
import dip.infra.persistence.EmailSender;

public class BookService {
    private BookRepositoryInMemory bookRepository;
    private EmailSender emailSender;
    private BookAssembler bookAssembler;

    public void addBook(BookDto newBookDto) {
        if (bookRepository.findByTitle(newBookDto.title) != null) {
            emailSender.notify("The book " + newBookDto.title + " was already added.");
        } else {
            Book newBook = bookAssembler.fromDto(newBookDto);
            bookRepository.add(newBook);
        }
    }
}
