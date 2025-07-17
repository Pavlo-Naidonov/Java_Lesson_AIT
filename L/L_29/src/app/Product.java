package app;

public class Product {
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s — %.2f €", name, price); //помощь от ии для выравнивания и тд (шаблон)
    }
}
