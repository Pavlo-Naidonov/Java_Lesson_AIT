package hw_18;

/*
Задача 1

Напишите программу, которая просит пользователя ввести строку и выводит на экран
 первое слово введенной строке, по-буквам, в столбик. Задачу необходимо реализовать двумя видами цикла из трех.

Например:

hello java

h
e
l
l
o

Ограничения:

если исходная строка из одного слова, выводим всю строку
слова разделены пробелом
в рамках этой задачи нельзя использовать substring
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ------------------(In)------------------ ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        int index = 0;

        System.out.println(" -----------------(Out: while)----------------- ");

        while (index < inputString.length() && inputString.charAt(index) != ' ') {
            System.out.println(inputString.charAt(index));
            index++;
        }

        System.out.println(" ------------------(Out: for)------------------ ");

        for (int i = 0; i < inputString.length(); i++){
            if (inputString.charAt(i) == ' '){
                break;
            }
            System.out.println(inputString.charAt(i));
        }

    }
}