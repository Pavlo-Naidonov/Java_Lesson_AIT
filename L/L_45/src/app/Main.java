package app;

import app.model.Auto;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Auto> autos = List.of(1
                new Auto(3, "BMW", 2019, 25000),
                new Auto(1, "Audi", 2022, 33000),
                new Auto(2, "Tesla", 2021, 55000),
                new Auto(5, "Nissan", 2020, 24000),
                new Auto(4, "Opel", 2023, 31000),
                new Auto(6, "Tesla", 2021, 45000)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вы хотите сортировать?: 1.id | 2.brand | 3.year | 4.prise");

        List<Auto> sortedList = null;

        Comparator<Auto> comparator = null;
        switch (scanner.nextInt()){
            case 1:
                comparator = (Auto a1, Auto a2) -> {return Integer.compare(a1.getId(),a2.getId());};
                break;
            case 2:
                comparator = (Auto a1, Auto a2) -> {return a1.getBrand().compareTo(a2.getBrand());};
                break;
            case 3:
                comparator = (Auto a1, Auto a2) -> {return Integer.compare(a1.getYear(),a2.getYear());};
                break;
            case 4:
                comparator = (Auto a1, Auto a2) -> {return Double.compare(a1.getPrise(),a2.getPrise());};
                break;
            default: return;
        }

    }
}