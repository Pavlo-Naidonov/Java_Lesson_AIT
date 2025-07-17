package app;

/*
Задание 1

Допустим дан список строк. Используя итератор реализуйте следующие методы:

метод String join(List list), который в качестве результата возвращает строку,
полученную соединением всех строк исходного списка через запятую.

   Пример ["jack","ann","kim"] -> jack,ann,kim

Удаляет из исходного списка все строки короче 3 символов
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("hi", "jack", "ok", "kim", "a"));

        StringCleaner.removeShortStrings(names);
        System.out.println("Посля удаленния коротких: " + names);

        String result = StringJoiner.join(names);
        System.out.println("Ряд: " + result);
    }
}