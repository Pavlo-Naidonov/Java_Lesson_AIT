package hw_27;

/*
Задача 1

Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов:
title (название), author (автор), genre (жанр), yearOfPublished (год издания).
Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры

Задача 2

Реализуйте класс BookArray, который управляет массивом книг. Класс должен позволять

вывести все книги на экран
вывести на экран все книги данного автора
ответит есть ли книга с заданным названием в массиве
 */

public class Main {
    public static void main(String[] args) {
        /*
        Book book1 = new Book("Властелин колец", "Дж.Р.Р. Толкин" , "Фентези" , 1954);
        Book book2 = new Book("Игра престолов", "Джордж Мартин" , "Фентези" , 1996);

        System.out.println(book1);
        System.out.println(book2);

        book1.setYearOfPublished(1955);
        System.out.println("Обновленная книга: " + book1);
         */

        Book[] myBooks = {
                new Book("Властелин колец", "Дж.Р.Р. Толкин" , "Фентези" , 1954),
                new Book("Игра престолов", "Джордж Мартин" , "Фентези" , 1996),
                new Book("Хоббит", "Дж.Р.Р. Толкин", "Фентези", 1937)
        };

        BookArray bookArray = new BookArray(myBooks);

        System.out.println("Все книги: ");
        bookArray.printAllBooks();

        System.out.println("=======================================");

        //найти все книги автора
        System.out.println("Книги Толкина: ");
        bookArray.printBooksByAuthor("Дж.Р.Р. Толкин");

        System.out.println("=======================================");

        //найти книгу по названию
        System.out.println("Есть ли книга 'Хоббит'? " + bookArray.containBooks("Хоббит"));
        System.out.println("Есть ли книга 'Гарри Поттер'? " + bookArray.containBooks("Гарри Поттер"));
    }
}