package app;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Создаем объект сканер для чтения данных из консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:" );
        String str1 = scanner.nextLine();
        System.out.println("Вы ввели: " + str1 );

        System.out.println("Введите целое число:" );
        int intValue = scanner.nextInt();
        System.out.println("Введите второе целое число:" );
        int intValue2 = scanner.nextInt();

        System.out.println("Вы ввели такое число: " + intValue);
        System.out.println("Вы ввели такое второе число: " + intValue2 );
        System.out.println("Сумма: " + (intValue + intValue2) );

        System.out.println("Введите дробно число:" );
        double dbValue = scanner.nextDouble();
        System.out.println("Вы ввели: " + dbValue );



    }
}