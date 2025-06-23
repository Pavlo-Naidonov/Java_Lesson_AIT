package hw_27;

/*
Задача 1

Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов:
title (название), author (автор), genre (жанр), yearOfPublished (год издания).
Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры
 */

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Властелин колец", "Дж.Р.Р. Толкин" , "Фентези" , 1954);
        Book book2 = new Book("Игра престолов", "Джордж Мартин" , "Фентези" , 1996);

        System.out.println(book1);
        System.out.println(book2);

        book1.setYearOfPublished(1955);
        System.out.println("Обновленная книга: " + book1);
    }
}