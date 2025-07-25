package hw_19;

/*
Задача 2

Пользователь водит целое число. Ваша задача определить, является ли жто число простым.
Напомню, простое число это то, которое без остатка делится только на 1 и на само себя,
иными словами, не делится ни на какое число больше. Например:

5 простое делится только на 1 и на 5
6 не простое делится на 1, 2, 3 и 6
 */

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        // ИИ подсказал и поправил меня ибо не работало, честно говоря,
        // было сложновато, хорошо бы еще поработать с циклами и boolean-

        // Далее заметки я делал пока, анализировал пошагово код

        boolean isPrimeNum = true; //если число простое

        for (int i = 2; i < num; i++){ //пока число больше 2 то прибавлять к i 1
            if (num % i == 0){ // делиться ли без остатка на i, а i это всё от 2 до num
                isPrimeNum = false; // тогда false и число не простое
                break; //если не простое, то сразу остановить
            }
        }

        if (num < 2) { //"предохранитель" если введенное число меньше 2
            isPrimeNum = false;
        }

        if (isPrimeNum){ //если все еще true - то простое
            System.out.println(num + " - простое число");
        } else { //если false - не простое
           System.out.println(num + " - не простое число");
        }

    }
}
