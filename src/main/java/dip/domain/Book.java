package dip.domain;

public class Book {
    private String title;
    private Uploader uploader;

    public Book(String title, Uploader uploader) {
        this.title = title;
        this.uploader = uploader;
    }

    public String getTitle() {
        return title;
    }

    public void uploadWithDefaultMethod(String uploadPath) {
        uploader.upload(uploadPath, title);
    }
}
