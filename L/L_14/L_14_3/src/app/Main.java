package app;

public class Main {
    public static void main(String[] args) {

        //String s1 =  new String("hello");

        String str = "hello";  // используем двойные кавычки
        System.out.println(str);

        String str2 = "Java";
        System.out.println(str + " " + str2);

        System.out.println(str + 2);  //"hello2"

        double f = 10.5;
        System.out.println(str+f);  //"hello" + "10.5" ->  "hello10.5"
        System.out.println(str + 2 + f);  //"hello" + "2" + "10.5" ->  "hello210.5"

        boolean isOk = true;
        System.out.println(str+isOk); // "hello" + "true" -> "hellotrue"

        System.out.println("----------------------------------------");
        String myString = "Hello Java!";
        int length = myString.length();  // сколько символов в строке myString
        String toUpperCase = myString.toUpperCase(); // Строка заглавными буквами
        String toLowerCase = myString.toLowerCase(); // Строка строчными буквами

        System.out.println("Строка: " + myString);
        System.out.println("Длинна строки: " + length);
        System.out.println("Строка заглавными буквами: " + toUpperCase);
        System.out.println("Строка строчными буквами: " + toLowerCase);
        System.out.println("Первый символ (char) в строке: " + myString.charAt(0));
        System.out.println("Второй символ (char) в строке: " + myString.charAt(1));
        int lastIndex = myString.length()-1; // индекс последнего символа в строен
        System.out.println("Последний символ (char) в строке: " + myString.charAt(lastIndex));

        int firstSpaceIndex = myString.indexOf(" "); // indexOf - поиск в строке
        int lastSpaceIndex = myString.lastIndexOf(" "); // lastIndexOf - поиск в строке
        System.out.println("Первый пробел имеет индекс: " + firstSpaceIndex);

        System.out.println( "Слово Java начинается с :" + myString.indexOf("Java"));
        // если нет совпадений то -1

        // substring - получить часть строки
        String s1 = myString.substring(5);
        System.out.println(s1);
        String s2 = myString.substring(0,6); // start - включаем в результат, finish - нет
        System.out.println(s2);







    }

}
