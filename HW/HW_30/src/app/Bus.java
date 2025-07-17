package app;

class Bus extends Vehicle {
    private int numberOfPassengers;

    public Bus(String number, String brand, int year, int numberOfPassengers) {
        super(number, brand, year);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void drive() {
        System.out.println(number + ": поехали! Везем " + numberOfPassengers + " пассажиров.");
    }
}