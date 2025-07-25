package hw_50_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user_input.txt"))) {
            System.out.println("Введите строки (для выхода введите 'exit'):");

            while (true) {
                String line = scanner.nextLine();

                if (line.equalsIgnoreCase("exit")) {
                    break; // выход из цикла
                }

                writer.write(line); // записываем строку в файл
                writer.newLine();   // добавляем перевод строки
            }

            System.out.println("Строки успешно записаны в файл!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}