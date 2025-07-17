package hw_31_t_1;

class Square extends Shape {
    private double side;

    public  Square(double side){
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side; //формула площади
    }

    @Override
    public String toString() {
        return "Квадрат (сторона: " + side + ")";
    }
}
