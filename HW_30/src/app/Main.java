package app;

/*
Задача 1

Предположим, у вас есть программа для учета различных видов транспортных средств в автопарке.

У вас есть базовый класс Vehicle, который представляет общую информацию о транспортном средстве,
такую как номер (number), марка (brand)  и год выпуска (year).

Создайте подклассы для различных типов транспортных средств, таких как Car, Truck, Bus и т. д.

В каждом Truck, Bus добавьте дополнительные свойства, специфичные для данного типа транспортного средства.
Например, для Truck - грузоподъемность (loadCapacity),  для Bus - кол-во пассажиров (numberOfSeats or numberOfPassenger).

Создайте метод drive() который выводит на экран номер транспортного средства и слово 'поехали'.
Кроме этого, в случае Truck - метод должен выводить запись о том, что перевозим столько то тонн груза,
а в случае Bus - столько то пассажиров.

В main создайте список транспортных средств и каждое "отправьте в поездку" т.е. drive()
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();

        // Додаємо різні транспортні засоби
        fleet.add(new Car("AA1234BB", "Toyota", 2020));
        fleet.add(new Truck("TR5555XX", "Volvo", 2018, 15.5));
        fleet.add(new Bus("BS7890YY", "Mercedes", 2019, 42));
        fleet.add(new Truck("TR0001ZZ", "MAN", 2022, 20.0));
        fleet.add(new Car("AA9876BB", "Honda", 2021));

        // Відправляємо всі в поїздку
        for (Vehicle v : fleet) {
            v.drive();
        }
    }
}
