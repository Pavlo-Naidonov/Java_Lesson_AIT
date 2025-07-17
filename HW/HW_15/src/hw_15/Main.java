package hw_15;

/*
Задание 1
Ваша программа должна (используя Scanner) запросить

возраст пользователя
имя пользователя
Именно в таком порядке, сначало возраст потом имя.
Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:

Jack (20)

Естественно, в результат должны подставится введенные данные.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите свое имя: ");
        String name = scanner.nextLine();

        System.out.println(name + "(" + age + ")");

        }
    }