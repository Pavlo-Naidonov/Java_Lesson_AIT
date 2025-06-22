package hw_26;

/*
Задача 2
Используя написанные в задаче 1 классы и методы напишите программу,
которая позволяет ввести несколько домашних животных и формирует из них массив.
Выведите этот массив на экран.
 */

import java.util.Scanner;

public class PetApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько животных вы хотите записать? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Pet[] pets = new Pet[count];

        for (int i = 0; i < pets.length; i++){
            System.out.println("Введите данные для животного №" + (i + 1));
            pets[i] = Pet.createPetFromInput();
        }

        System.out.println("Вы ввели этих животных: ");
        for (Pet pet : pets){
            System.out.println(pet);
        }
    }
}