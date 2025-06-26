package app;

/*
Задача 2

Давайте создадим класс Product. Пусть у нашего продукта будет название и цена.
Создайте в программе список из Product, и выведите его на экран, например так:

1. Хлеб 1.79
2. Молоко 1.05
3. Масло 2.39
4. Колбаса 2.99
5. Рис 0.99

Реализуйте возможность для пользователя указывать номер позиции, тем самым добавлять продукт в корзину.
Один и тот же продукт может несколько раз быть добавленным в корзину.
Если пользователь ввел '0' считаем что ввод закончен.
Система должна распечатать все продукты в корзине и количество и сумму заказа.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Хлеб", 1.79));
        products.add(new Product("Молоко", 1.05));
        products.add(new Product("Масло", 2.39));
        products.add(new Product("Колбаса", 2.99));
        products.add(new Product("Рис", 0.99));

        System.out.println("Меню товаров: ");
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, products.get(i));//помощь от ии для выравнивания и тд
        }

        ArrayList<Product> cart = new ArrayList<>();

        while (true) {
            System.out.print("\nВведите номер товара (0 - выход): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice < 1 || choice > products.size()) {
                System.out.println("Неправильный номер, попробуйте ще раз");
                continue;
            }

            Product selectedProduct = products.get(choice - 1);
            cart.add(selectedProduct);
            System.out.println("Добавлено!: " + selectedProduct.name);
        }

        System.out.println("\nВаша корзина:");

        ArrayList<Product> uniqueProducts = new ArrayList<>();
        for (Product product : cart) {
            if (!uniqueProducts.contains(product)) {
                uniqueProducts.add(product);
            }
        }

        double total = 0;
        for (Product product : uniqueProducts) {
            int count = 0;
            for (Product p : cart) {
                if (p == product) {
                    count++;
                }
            }

            double subtotal = product.price * count;
            System.out.printf("- %s x%d = %.2f €\n", product.name, count, subtotal);
            total += subtotal;
        }

        System.out.printf("\nОбщая сума: %.2f €\n", total);
    }
}