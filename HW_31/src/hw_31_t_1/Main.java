package hw_31_t_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Square(4));
        shapes.add(new Rectangle(3, 6));
        shapes.add(new Circle(2));
        shapes.add(new Square(10));


        double total = 0;
        for (Shape s : shapes) {
            total += s.calcArea();
        }
        System.out.println("Сума площадей " + total);


        Shape max = shapes.get(0);
        for (Shape s : shapes) {
            if (s.calcArea() > max.calcArea()) {
                max = s;
            }
        }
        System.out.println("Самая большая фигура: " + max + " (" + max.calcArea() + ")");


        double limit = 50;
        System.out.println("Фигуры площадью более " + limit + ":");
        for (Shape s : shapes) {
            if (s.calcArea() > limit) {
                System.out.println(" - " + s + " (Площадь: " + s.calcArea() + ")");
            }
        }
    }
}