package hw_24_task_3;

/*
Задача 3 (чуть сложнее)

Создайте классы MyData и Person по примеру того, как это было на занятие.
Создайте класс BankAccount (банковский счет) со следующими полями

String iban - номер счета
double balance - баланс счета
Person owner - владелец счета
MyDate open - дата открытия Вам необходимо создать конструктор и
затем создать в программе несколько объектов банковских счетов
Необходимо написать метод, который формирует строку с информацией о счете, например, такого вида:

"DE123412341234  Н.Петров (19/10/1987) Счет открыт: 1/2/2025  Баланс 10345.10"
~~
 */

public class Main {

    public static void main(String[] args){

        MyDate birth1 = new MyDate(19, 10, 1987);
        MyDate birth2 = new MyDate(5, 4, 1990);

        MyDate open1 = new MyDate(1, 2, 2025);
        MyDate open2 = new MyDate(15, 3, 2024);

        Person person1 = new Person("Николай", "Петров", birth1);
        Person person2 = new Person("Анна", "Иванова", birth2);

        BankAccount account1 = new BankAccount("DE123412341234", 10345.10, person1, open1);
        BankAccount account2 = new BankAccount("DE987654321000", 5500.00, person2, open2);

        System.out.println(account1.getAccountInfo());
        System.out.println(account2.getAccountInfo());
    }
}
