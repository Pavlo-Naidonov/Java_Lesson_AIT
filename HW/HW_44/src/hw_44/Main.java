package hw_44;

/*
1
Допустим вы продаете автомобили. Т.е. есть класс Auto. У каждой машины есть номер (id), бренд, год выпуска, цена. У вас есть список автомобилей.
Ваша программа должна уметь получать список автомобилей отсортированный по:

номеру
цене
году выпуска
бренду

Естественно, вам придется реализовать соответствующие компараторы. Естественно, реализовывать нужно лямбда-выражением.
2
В программе задан список Person{ String fName, String lName, String email, String
    phone, Address address}. Address{String postcode, String city, String street, String
    house}
Реализовать следующие функции:
        -получить список всех ФИО
-получить список всех e-mail
-получить список всех телефонов
-получить список всех адресов в виде строки адреса

Естественно, все вышеперечисленные функции может и должен реализовать
        один метод, в который в качестве параметра должен приходить список Person и
реализация необходимого способа обработки.


Подсказка на следующей странице
создать функциональный  интерфейс с методом String personToString(Person p)
В main реализовать метод, который в качестве параметра принимает лист Person, а возвращает лист строк. Вторым параметром метод должен принимать интерфейс ваш функциональный интерфейс
*/

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Auto> autos = List.of(
                new Auto(3, "BMW", 2020, 25000),
                new Auto(1, "Audi", 2022, 30000),
                new Auto(2, "Tesla", 2021, 45000)
        );

        autos.stream()
                .sorted(Comparator.comparingInt(Auto::getId))
                .forEach(System.out::println);

        System.out.println("===========================");

        autos.stream()
                .sorted(Comparator.comparingDouble(Auto::getPrice))
                .forEach(System.out::println);

        System.out.println("===========================");

        autos.stream()
                .sorted(Comparator.comparingInt(Auto::getYear))
                .forEach(System.out::println);

        System.out.println("===========================");

        autos.stream()
                .sorted(Comparator.comparing(Auto::getBrand))
                .forEach(System.out::println);
    }
}