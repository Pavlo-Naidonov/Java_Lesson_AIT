package hw_14_2;

/*
Задание 2
Обратная задача. Исходные данные программы: строка вида

Николай Иванович Петров
Copy
Написать программу, которая рахбирает строку на три переменные:

имя
отчество
фамилия
Подсказка: Вам понадобятся методы строки indexOf(), lastIndexOf и substring()
 */

public class Main {

    public static void main(String[] args) {

        String fulName = "Pavlo Naidonov Oleksievich";

        int firstSpace = fulName.indexOf(' ');
        int lastSpace = fulName.lastIndexOf(' ');

        String name = fulName.substring(0, firstSpace);
        String patronymic = fulName.substring(firstSpace + 1, lastSpace);
        // дал ии на проверку, тот порекомендовал поставить + 1, что бы убрать лишний пробел,
        // а я даже не заметил этого сначала
        String surname = fulName.substring(lastSpace + 1); // то же самое с + 1

        System.out.println("Name: " + name);
        System.out.println("Patronymic: "+ patronymic);
        System.out.println("Surname: " + surname);
    }
}