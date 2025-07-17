package app;

public class Main {

    public static void main(String[] args) {

        char chA = 'B'; // одинарные кавычки
        /*
        65 - A
        66 - B
        67 - C
        ----
         */


        int intChA = (int) chA;

        System.out.println("Символ '" + chA + "' имеет код - " + intChA);

        int diff = 32;
        System.out.println((char) (chA + diff) );
        System.out.println((chA + diff) );







    }

}
