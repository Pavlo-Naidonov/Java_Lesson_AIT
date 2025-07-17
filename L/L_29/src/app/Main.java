package app;

/*
Задача 1

Напишите программу, которая позволяет пользователю вводить целые числа.
Как только пользователь введет 0 - считаем что ввод закончен.
Программа должна вывести на экран все введенные числа и их сумму
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        System.out.println("Введите целые числа (0 для завершения): ");

        while (true){
            int number = scanner.nextInt();
            if (number == 0){
                break;
            }
            numbers.add(number);
            sum += number;
        }

        System.out.println("Вы ввели такие числа: " + numbers);
        System.out.println("Сума этих чисел: ");
    }
}