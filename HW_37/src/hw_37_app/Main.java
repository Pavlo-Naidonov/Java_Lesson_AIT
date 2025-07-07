package hw_37_app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1000.0, 4.5, 10));
        products.add(new Product("Phone", 600.0, 4.7, 25));
        products.add(new Product("Tablet", 400.0, 4.2, 5));
        products.add(new Product("Monitor", 200.0, 4.1, 8));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ сортировки:");
        System.out.println("1 - по цене (возрастание)");
        System.out.println("2 - по цене (убывание)");
        System.out.println("3 - по рейтингу");
        System.out.println("4 - по количеству на складе");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                products.sort(ProductComparators.byPriceAsc);
                break;
            case 2:
                products.sort(ProductComparators.byPriceDesc);
                break;
            case 3:
                products.sort(ProductComparators.byRating);
                break;
            case 4:
                products.sort(ProductComparators.byStock);
                break;
            default:
                System.out.println("Неверный выбор. Показываем как есть.");
        }

        System.out.println("Список товаров:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}