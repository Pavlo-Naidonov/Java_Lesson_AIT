package app.servise;

import app.model.Auto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AutoServise {


    static Comparator<Auto> comparator = null;

    public static List<Auto> sort (List<Auto> list){
        ArrayList<Auto> sorted = new ArrayList<>(list);
        sorted.sort(comparator);
        return sorted;
    }

    public static void print (List<Auto> autos){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}
