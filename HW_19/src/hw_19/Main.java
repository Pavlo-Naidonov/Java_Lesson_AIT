package hw_19;

/*
Задача 1

Пользователь водит строку. Ваша задача получить новую строку,
которая будет состоять из букв исходной, стоящих на нечетных позициях. Например:

Ввод: "java is very easy"
Вывод: "aai eyes"

или

Ввод: "0123456"
Вывод: "135"
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        String result = "";

        for (int i = 0; i < string.length(); i++){
            if (i % 2 != 0){
                result += string.charAt(i);
            }
        }

        System.out.println("Результат: " + result);

    }
}