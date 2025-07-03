package hw_35_t_1;

import java.util.*;

public class BookCounter {
    public static int countOccurrences(List<Book> books, Book target) {
        int count = 0;
        for (Book book : books) {
            if (book.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        library.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.add(new Book("1984", "George Orwell"));
        library.add(new Book("The Hobbit", "J.R.R. Tolkien")); // копія
        library.add(new Book("Brave New World", "Aldous Huxley"));

        Book target = new Book("The Hobbit", "J.R.R. Tolkien");

        System.out.println("Книга " + target + " встречается " +
                countOccurrences(library, target) + " раза.");
    }
}