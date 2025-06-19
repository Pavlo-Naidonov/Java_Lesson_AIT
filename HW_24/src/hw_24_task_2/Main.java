package hw_24_task_2;

/*
Задача 2

Создайте класс Auto (машина) Поля: брэнд, цвет, год выпуска,
цена Создайте несколько объектов этого класса. Напишите метод, который выводит на экран данные машины.
 */

public class Main {
    public static void main(String[] args) {
        Auto car1 = new Auto("Toyota", "Красный", 2015, 12000);
        Auto car2 = new Auto("BMW", "Черный", 2018, 22000);
        Auto car3 = new Auto("Honda", "Белый", 2020, 18000);

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
    }
}
