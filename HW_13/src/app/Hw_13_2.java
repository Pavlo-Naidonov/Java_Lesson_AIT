package app;

public class Hw_13_2 {

    public static void main(String[] args){

        /*
        Задание 2

        Создайте новый класс. Создайте метод main. Объявите 2 переменные:

        -цена товара без налога;
        -налог

        Напишите программу, которая вычисляет цену товара с налогом

        Например, так:

        Введите цену товара: 200.0
        Налог составит: 19
        Цена с налогом 238.0
         */

        double price_of_goods_without_tax = 200;
        int tax = 19;

        double tax_amount = price_of_goods_without_tax * tax / 100;
        double final_price = price_of_goods_without_tax + tax_amount;

        System.out.println("Введите цену товара: " + price_of_goods_without_tax);
        System.out.println("Налог составит: " + tax);
        System.out.println("Цена с налогом: " + final_price);
    }
}
