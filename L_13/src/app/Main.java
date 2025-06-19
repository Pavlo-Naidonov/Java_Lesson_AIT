package app;
/*
oipoeelknfds'l'ldsn'lfds

группа 68
 */

public class Main {

    public static void main(String[] args) {



        int numberOfPeopleInGroup = 14;
        double weightOfCat = 4.8;
        int numberOfPeopleInSubgroup = 4;
        byte numberOfDay;

        numberOfDay = 1;

        System.out.println("Количество людей " + numberOfPeopleInGroup);
        System.out.println("Вес кота " + weightOfCat);


        weightOfCat += 1;  //  weightOfCat  =  weightOfCat + 1;

        System.out.println("Новый вес кота " + weightOfCat);

        int numberOfSubGroups = numberOfPeopleInGroup / numberOfPeopleInSubgroup; // щелочисленное деление
        System.out.println("Количество подгруп:"  + numberOfSubGroups);


        int a = 17;
        int b = 5;

        int res1 = a / b;      // целочисленное деление
        int ostatok = a % b;  // остаток от деления
        System.out.println("res1: " + res1);
        System.out.println("Остаток от деления: " + ostatok);


        double x = 17.0;
        double y = 5;
        // int z = 10.3;  // ошибка

        double res2 = x / y;
        System.out.println("res2:" + res2);

    }

}