package hw_31_t_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plant> garden = new ArrayList<>();
        garden.add(new Tree());
        garden.add(new Bush());
        garden.add(new Flower());

        for (Plant p : garden) {
            p.year();
            System.out.println(p.getName() + ": " + p.getHeight() + " (макс: " + p.getMaxHeight() + ")");
        }
    }
}
