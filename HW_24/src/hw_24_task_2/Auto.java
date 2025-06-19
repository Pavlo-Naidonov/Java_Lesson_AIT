package hw_24_task_2;

/*
Задача 2

Создайте класс Auto (машина) Поля: брэнд, цвет, год выпуска,
цена Создайте несколько объектов этого класса. Напишите метод, который выводит на экран данные машины.
 */

public class Auto {
    public static void main(String[] args) {
    }

        String brand;
        String color;
        int year;
        double price;

        public Auto(String b, String c, int y, double p){
            brand = b;
            color = c;
            year = y;
            price = p;
        }

        public void displayInfo(){
            System.out.println("Марка: " + brand);
            System.out.println("Цвет: " + color);

            System.out.println("Год выпуска: " + year);
            System.out.println("Цена: " + price);
            System.out.println("====================");
        }
}