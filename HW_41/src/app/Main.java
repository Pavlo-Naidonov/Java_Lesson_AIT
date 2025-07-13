package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "John", "Nick", "John");
        boolean hasDuplicates = checkDuplicates(names);
        System.out.println("Есть дупликаты? " + hasDuplicates);

        String namesLine = "Jack,John,Nick,John";
        String uniqueNames = removeDuplicatesFromString(namesLine);
        System.out.println("Без дупликатов: " + uniqueNames);
    }

    public static boolean checkDuplicates(List<String> list) {
        Set<String> set = new HashSet<>();

        for (String name : list) {
            if (set.contains(name)) {
                return true;
            }
            set.add(name);
        }

        return false;
    }



    public static String removeDuplicatesFromString(String input) {
        String[] nameArray = input.split(",");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(nameArray));
        return String.join(",", set);
    }
}