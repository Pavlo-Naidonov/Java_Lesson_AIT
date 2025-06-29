package hw_31_t_1;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius; //формула площади круга
    }

    @Override
    public String toString() {
        return "Круг (радиус: " + radius + ")";
    }
}
