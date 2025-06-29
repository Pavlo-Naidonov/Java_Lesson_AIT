package hw_31_t_1;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height; //формула площади
    }

    @Override
    public String toString() {
        return "Прямокутник (" + width + " x " + height + ")";
    }
}