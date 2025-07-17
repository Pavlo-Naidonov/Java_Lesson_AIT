package app.model;

public class Auto {
    private int id;
    private String brand;
    private int year;
    private double prise;

    public Auto(int id, String brand, int year, double prise) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.prise = prise;
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

    public double getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", prise=" + prise +
                '}';
    }
}
