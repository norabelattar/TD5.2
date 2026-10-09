package dip.domain;

import dip.infra.persistence.BookPDFUploader;

public class Book {
    private String title;
    private BookPDFUploader defaultUploader;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void uploadWithDefaultMethod(String uploadPath) {
        defaultUploader.upload(uploadPath, title);
    }
}
