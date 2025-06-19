package app;


public class Hw_13_1 {

    public static void main(String[] args) {

        /*
        Задание 1

        Создайте новый модуль. В модуле создайте package c названием app. Создайте новый класс.
        Создайте метод main. Исходные данные: Цена за один билет в кино составляет 4 у.е. У вас 19 у.е.

        Напишите программу, которая сохраняет эти данные в переменных, вычисляет и выводит в консоль,
        сколько билетов вы можете купить. Сколько денег у вас останется, после покупки максимально
        возможного количества билетов.
         */

        double your_money = 19;
        double price_ticket = 4;

        int ticketsCanBuy = (int)(your_money / price_ticket);
        double change = your_money - (ticketsCanBuy * price_ticket);

        System.out.println("У Вас " + your_money + " денег");
        System.out.println("вы можете купить " + ticketsCanBuy +  " билетов");
        System.out.println("При этом у Вас остается " + change + " денег");
    }
}