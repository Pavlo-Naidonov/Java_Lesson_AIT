package hw_17;

/*
Задача 2

Напишите программу, которая просит пользователя ввести два числа
и выбрать операцию умножить, сложить, умножить или поделить.
В качестве результата система должна выводить строку вида:

3 * 3 = 9

Естественно, числа и операция должны зависеть от введенных данных.
 */

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение (например, 2 + 3 (Обязательно с пробелами!): ");
        double a = scanner.nextDouble();
        char op = scanner.next().charAt(0);
        double b = scanner.nextDouble();

        double result;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Неизвестная операция!");
                return;
        }

        System.out.println(a + " " + op +  " " + b + " " + " = " + result);
    }
}
