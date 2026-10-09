package dip.application;

import dip.domain.Book;
import dip.domain.Uploader;

public class BookAssembler {

    public Book fromDto(BookDto bookDto, Uploader uploader) {
        return new Book(bookDto.title, uploader);
    }
}
