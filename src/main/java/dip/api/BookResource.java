package dip.api;

import dip.application.BookService;
import jakarta.ws.rs.core.Response;

public class BookResource {

    private BookService bookService;

    public Response addBook(BookDto newBook) {
        bookService.addBook(newBook);
        return Response.status(Response.Status.CREATED).build();
    }
}
