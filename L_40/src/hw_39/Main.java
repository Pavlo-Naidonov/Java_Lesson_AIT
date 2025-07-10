package hw_39;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("jack");
        myList.add("ann");
        myList.add("joni");
        myList.add("nick");
        myList.add("cage");

        System.out.println(join(myList));
    }

    public static String join(List<String> list){
        String string = "";
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            string += element;
            if (iterator.hasNext()){
                string += ",";
            }
        }

        return string;
    }

    public static void delete(List<String>list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if (word.length()<3){
                iterator.remove();
            }
        }
    }

}