package hw_50_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task_2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"))) {
            String line;

            System.out.println("Содержимое файла:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line); // вывод каждой строки на экран
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
