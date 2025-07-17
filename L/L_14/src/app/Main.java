package app;

public class Main {
    public static void main(String[] args) {

        long a = 1234567898765L; // L при объявление long
        long b = 1_234_546_876L; // _ для разделения разрядов
        float f = 7762.7F;    // F при объявление float
        boolean isOk = false;  // true / false


        int i1 = 10;
        double d1 = i1;
        System.out.println("d1 = " + d1);  // 10.0


        //i1 = d1 // ошибка!!! double нельзя положить в int

        double d2 = 19.783;
        int i2 = (int) d2;  // (int) явное преобразование типа данных переменной к типу int

        System.out.println("i2 = " + i2);

        int i3 = 129;
        byte b1 = (byte) i3;

        System.out.println("b1 = " + b1);

    }
}