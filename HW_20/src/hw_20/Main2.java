package hw_20;

/*
Задача 2

Дан мпсств строк. Необходимо вываести его на экран.
Далее программа дожна запросить два целых числа - номера элементов,
и поменять местами соответствуюзие элементы.
После чего опять вывести массив на экран.
 */

import java.util.Scanner;

public class Main2 { 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("В массиве: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Введите два целых числа - номера элементов,\n" +
                "и поменять местами соответствующие элементы.\n" +
                "Введите первое число от 0 до " + (arr.length - 1) + ": ");
        int firstNum = scanner.nextInt();

        System.out.print("Введите второе число от 0 до " + (arr.length - 1) + ": ");
        int secondNum = scanner.nextInt();

        if (firstNum >= 0 && firstNum < arr.length && secondNum >= 0 && secondNum < arr.length){
            int temp = arr[firstNum]; //сохранили
            arr[firstNum] = arr[secondNum]; //поменяли
            arr[secondNum] = temp;

            System.out.println("Теперь массив выглядит так: ");
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("ERROR: введены неверные индексы!");
        }

    }
}