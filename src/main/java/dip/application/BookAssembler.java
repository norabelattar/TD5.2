package dip.application;

import dip.api.BookDto;
import dip.domain.Book;

public class BookAssembler {

    public Book fromDto(BookDto bookDto) {
        return new Book(bookDto.title);
    }
}
