package hw_14_1;

/*
Задание 1
Исходные данные программы:

имя
отчество
фамилия
Создайте переменные для этих данных. После чего сформируйте строке вида:

Николай Иванович Петров (Н.И. Петров)
Copy
Подсказка: что бы получить инициалы, используйте charAt как мы делали на занятие
*/

public class Main {

    public static void main(String[] args) {

        String name = "Pavlo ";
        String patronymic = "Oleksievich ";
        String surname = "Naidonov";

        System.out.println(name + patronymic + surname + " "  + "(" + name.charAt(0) + "." + patronymic.charAt(0) + ". " + surname + ")");
    }
}