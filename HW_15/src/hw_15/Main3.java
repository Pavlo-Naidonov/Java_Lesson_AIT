package hw_15;

/*
Задание 3 (чуть сложнее)
Исходные данные: есть длина и ширина комнаты, площадь паркета в одной упаковке.
Напишите программу, которая запрашивает эти данные у пользователя, сохраняет эти данные в переменных,
вычисляет и выводит в консоль, сколько упаковок паркета необходимо купить для этой комнаты.

Например:

Длинна комнаты: 4.0
Ширина комнаты: 3.0
В одной упаковке: 3.5 метра

Площадь комнаты 12 м.  необходимо 4 упаковки

Подсказка: здесь вам может пригодится преобразовать double - количество упаковок получившееся при расчетах , к int
 */

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Длинна комнаты: ");
        double lR = scanner.nextDouble();
        System.out.print("Ширина комнаты: ");
        double wR = scanner.nextDouble();

        System.out.print("В одной упаковке: ");
        double valueInPaket = scanner.nextDouble();

        System.out.println("Площадь комнаты: " + (lR * wR) );
        double area = lR * wR;

        int packages = (int) Math.ceil (area / valueInPaket); // у ии узнал про Math.ceil и как он работает

        System.out.println("Необходимо " + packages + " упаковки(ок)");

    }

}