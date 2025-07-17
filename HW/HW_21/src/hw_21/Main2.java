package hw_21;

/*
Задача 2

Дано два массива String[] names и int[ ] yearsOfBirthday одинаковой длинны,
которые соответственно содержат имена и годы рождения людей.
Каждый элемент в yearsOfBirthday соответствует элементу с таким же индексом в names.
Реализовать программу, которая распечатает список людей (имя плюс возраст) , которые старше заданного int.
Потом распечатать имя и возраст старейшего:
Например:

{“Olga”,”Oleg”,”Svetlana”,”Oleg”}
{2004,1982,2008,”2010”}
15

результат:

Olga 16 years
Oleg 38 years
_____________
Oleg 38 years is oldest
 */

public class Main2 {

    public static void main(String[] args) {

        String[] names = {"Olga", "Oleg", "Svetlana", "Oleg"};
        int[] yearsOfBirthday = {2004, 1982, 2008, 2010};
        int minAge = 15;

        int currentYear = 2025;
        int maxAge = 0;
        String oldestPerson = "";

        for (int i = 0; i < names.length; i++) {
            int age = currentYear - yearsOfBirthday[i];

            if (age > minAge){
                System.out.println(names[i] + age + " years");
            }
            if (age > maxAge){
                maxAge = age;
                oldestPerson = names[i];
            }
        }

        System.out.println("_____________");
        System.out.println(oldestPerson + " " + maxAge + " years ist oldest");
    }
}