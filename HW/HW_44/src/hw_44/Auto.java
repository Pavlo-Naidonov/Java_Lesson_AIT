package hw_44;

public class Auto {
    private int id;
    private String brand;
    private int year;
    private double price;

    public Auto(int id, String brand, int year, double price) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
