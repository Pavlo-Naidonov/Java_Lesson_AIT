package hw_27;
/*
Задача 2

Реализуйте класс BookArray, который управляет массивом книг. Класс должен позволять

вывести все книги на экран
вывести на экран все книги данного автора
ответит есть ли книга с заданным названием в массиве
 */

public class BookArray {
    private Book[] books;

    // Конструктор
    public BookArray(Book[] books){
        this.books = books;
    }

    // Метод 1: вывести все книги на экран
    public void printAllBooks(){
        for (Book book : books){
            System.out.println(book);
        }
    }

    // Метод 2: вывести на экран все книги данного автора
    public void printBooksByAuthor(String author){
        boolean found = false;
        for (Book book : books){
            if (book.getAuthor().equalsIgnoreCase(author)){
                System.out.println(book);
                found = true;
            }
        }
        if (!found){
            System.out.println("Книг этого автора не найдено");
        }
    }

    //Метод 3: ответит есть ли книга с заданным названием в массиве
    public boolean containBooks(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }
}