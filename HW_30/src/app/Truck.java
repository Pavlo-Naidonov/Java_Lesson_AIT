package app;

class Truck extends Vehicle {
    private double loadCapacity; // в тоннах

    public Truck(String number, String brand, int year, double loadCapacity) {
        super(number, brand, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void drive() {
        System.out.println(number + ": поехали! Перевозим " + loadCapacity + " тонн груза.");
    }
}