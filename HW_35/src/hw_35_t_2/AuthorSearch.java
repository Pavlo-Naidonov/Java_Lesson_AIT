package hw_35_t_2;

import java.util.*;

public class AuthorSearch {
    public static List<Book> findBooksByAuthor(List<Book> books, Author targetAuthor) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(targetAuthor)) {
                result.add(book);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Author tolkien = new Author("J.R.R.", "Tolkien", 1892);
        Author rowling = new Author("J.K.", "Rowling", 1965);
        Author lewis = new Author("C.S.", "Lewis", 1898);

        List<Book> library = new ArrayList<>();
        library.add(new Book("The Hobbit", List.of(tolkien)));
        library.add(new Book("Harry Potter", List.of(rowling)));
        library.add(new Book("The Fellowship of the Ring", List.of(tolkien)));
        library.add(new Book("The Inklings", List.of(tolkien, lewis)));

        List<Book> booksByTolkien = findBooksByAuthor(library, tolkien);

        System.out.println("Книги Толкина:");
        for (Book book : booksByTolkien) {
            System.out.println(book);
        }
    }
}