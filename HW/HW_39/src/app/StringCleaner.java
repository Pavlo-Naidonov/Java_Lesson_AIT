package app;

import java.util.Iterator;
import java.util.List;

public class StringCleaner {
    public static void removeShortStrings(List<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() < 3) {
                iterator.remove();
            }
        }
    }
}