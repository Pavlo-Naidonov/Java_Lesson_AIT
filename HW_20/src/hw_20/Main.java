package hw_20;

/*
Задача 1

Реализовать программу, которая просит пользователя ввести 5 имен, создает массив с этими именами и выводит их на экран:
Ввод:

jack
jonh
ann
lena
nick
Copy
Вывод:

0.jack
1.jonh
2. ann
3.lena
4.nick
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Введите 5 имен: ");

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("Введенные имена: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + "." + names[i]);
        }

    }
}