package hw_23;

/*
Задача 2

Написать метод, который разворачивает данный (т.е. исходный) массив в обратном порядке
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */

public class Main2 {

    public static void main(String[] args) {

        int[] array = {10, 3, 3, 5, -9};

        reverseArrayInPlace(array);

        System.out.print("Reversed array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArrayInPlace(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}