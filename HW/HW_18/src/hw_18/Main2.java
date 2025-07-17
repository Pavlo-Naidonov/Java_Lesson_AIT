package hw_18;

/*
Задача 2

Напишите программу, которая просит пользователя ввести строку и 1 символ.
Ваша программа должна считать, сколько раз заданный символ встречается во введенной строке

Например:

hello java
a

результат: 2
 */

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        System.out.print("Введите символ: ");
        char inputChar = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < inputString.length(); i++){
            if (inputString.charAt(i) == inputChar) {
                count++;
            }
        }

        System.out.println("Количество символов '" + inputChar + "' в '" + inputString + "' = " + count);

    }
}