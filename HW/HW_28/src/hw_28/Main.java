package hw_28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookArray bookArray = new BookArray();

        // Запрашиваем у пользователя количество книг для добавления
        System.out.println("Сколько книг вы хотите добавить?");
        int numBooks = scanner.nextInt();
        scanner.nextLine();

        // Цикл для ввода книг
        for (int i = 0; i < numBooks; i++) {
            System.out.println("Введите данные для книги " + (i + 1) + ":");
            System.out.print("Название: ");
            String title = scanner.nextLine();
            System.out.print("Автор: ");
            String author = scanner.nextLine();
            System.out.print("Жанр: ");
            String genre = scanner.nextLine();
            System.out.print("Год публикации: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            // Создаем книгу и добавляем в массив
            Book book = new Book(title, author, genre, year);
            bookArray.addBook(book);
        }

        // Вывод всех книг
        System.out.println("\nВсе книги:");
        bookArray.printAllBooks();

        // Поиск книг по автору
        System.out.println("\nВведите имя автора для поиска его книг:");
        String searchAuthor = scanner.nextLine();
        System.out.println("Книги автора " + searchAuthor + ":");
        bookArray.printBooksByAuthor(searchAuthor);

        // Поиск книги по названию
        System.out.println("\nВведите название книги для проверки:");
        String searchTitle = scanner.nextLine();
        System.out.println("Есть ли книга '" + searchTitle + "'? " + bookArray.containBooks(searchTitle));

        scanner.close();
    }
}