package hw_26;

/*
Задача 1

Давайте представим, что мы пишем программу для ветеринарной клиники.
Создайте класс Pet(Домашнее животное) Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст
Реализуйте конструктор, toString() Реализуйте метод, который позволяет создать объект Pet используя Scanner
 */

import java.util.Scanner;

public class Pet {

    String type;
    String name;
    String color;
    int age;

    public Pet(String type, String name, String color, int age){
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString(){
        return "Тип: " + type + ", Имя: " + name + ", Цвет: " + color + ", Возраст: " + age + " года/лет";
    }

    public static Pet createPetFromInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите тип животного (кот, собака, попугай и тд): ");
        String type = scanner.nextLine();

        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите цвет животного: ");
        String color = scanner.nextLine();

        System.out.print("Ведите возраст животного: ");
        int age = scanner.nextInt();

        return new Pet(type, name, color, age);
    }
}