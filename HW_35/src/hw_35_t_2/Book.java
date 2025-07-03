package hw_35_t_2;

import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }
}
