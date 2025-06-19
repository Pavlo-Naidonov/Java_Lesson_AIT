package hw_15;

/*
Задание 2
Ваша программа должна (используя Scanner) запросить

    1.имя первого пассажира
    2.количество груза первого пассажира (целое число)
    3.имя второго пассажира
    4.количество груза первого пассажира (целое число) // Achtung! Наверное имелось ввиду "второго пассажира"!

Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:

Пассажир 1: имя, багаж: xxx
Пассажир 2: имя, багаж: xxx
Всего багажа: yyy

Естественно, в результат должны подставится введенные данные.
 */

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого пассажира: ");
        String name1 = scanner.nextLine();

        System.out.print("Введите количество груза первого пассажира (целое число): ");
        int cargo1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите имя второго пассажира: ");
        String name2 = scanner.nextLine();

        System.out.print("Введите количество груза второго пассажира (целое число): ");
        int cargo2 = scanner.nextInt();

        System.out.println("Пассажир 1: " + name1 + ", багаж: " + cargo1);
        System.out.println("Пассажир 2: " + name2 + ", багаж: " + cargo2);
        System.out.println("Всего багажа: " + (cargo1 + cargo2) );

    }
}
