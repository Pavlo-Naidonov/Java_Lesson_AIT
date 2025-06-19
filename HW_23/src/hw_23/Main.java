package hw_23;

/*
Задача 1

Написать метод, который создает и возвращает новый массив который является копией исходного,
но в обратном порядке {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */

public class Main {

    public static void main(String[] args) {

        int[] array = {10, 3, 3, 5, -9};

        int[] reversed = reverseArray(array);

        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverseArray(int[] originalArray) {

        int[] reversedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }
        return reversedArray;
    }
}
