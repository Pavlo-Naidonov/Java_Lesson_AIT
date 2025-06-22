import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j = 10;
        System.out.println("j=" + j);
        //System.out.println("j++ = " + j++); // постфиксная операция
        System.out.println("++j = " + ++j);  // префиксная
        System.out.println("j = " + j);


                    /*
            System.out.println(j--); // сначала вывод на экран j, потом j = j - 1;
            System.out.println(--j); // сначала j = j - 1 потом вывод на экран j

             */

    }
}

// Change

/*
public static void getPetStatistics(Pet[] pets) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nВведите тип животного, для которого хотите получить статистику: ");
    String targetType = scanner.nextLine();

    int count = 0;
    int totalAge = 0;

    for (Pet pet : pets) {
        if (pet.type.equalsIgnoreCase(targetType)) {
            count++;
            totalAge += pet.age;
        }
    }

    if (count > 0) {
        double averageAge = (double) totalAge / count;
        System.out.println("Найдено " + count + " животных типа \"" + targetType + "\".");
        System.out.println("Средний возраст: " + averageAge + " года/лет.");
    } else {
        System.out.println("Животные типа \"" + targetType + "\" не найдены.");
    }
}
 */