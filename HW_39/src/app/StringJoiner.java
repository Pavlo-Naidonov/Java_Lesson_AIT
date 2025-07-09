package app;

import java.util.Iterator;
import java.util.List;

public class StringJoiner {
    public static String join(List<String> list){
        StringBuilder result = new StringBuilder();
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();
            result.append(word);
            if (iterator.hasNext()) {
                result.append(","); // додаємо кому, але не після останнього слова
            }
        }

        return result.toString();
    }
}
