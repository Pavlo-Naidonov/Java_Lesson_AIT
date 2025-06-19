package hw_20;

/*
Задача 3

Дан мпсств строк. Пользовтель вводит строку. Программа должна сосчитать,
сколько раз введенная строка встречается в массиве.
 */

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = {"Pavlo", "Katya", "Sasha", "Oleg", "Vanya", "Pavlo", "Oleg", "Oleg"};

        System.out.print("В массиве: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        System.out.println();
        System.out.print("Введите строку для поиска совпадений: ");
        String string = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string)) { //.equals для сравнений, ИИ подсказал
                count++;
            }
        }

        System.out.println("Кол-во совпадений: " + count);
    }
}