package app;

public class Vehicle {

    protected String number;
    protected String brand;
    protected int year;

    public Vehicle(String number, String brand, int year) {
        this.number = number;
        this.brand = brand;
        this.year = year;
    }
    public void drive() {
        System.out.println(number + ": поехали!");
    }
}