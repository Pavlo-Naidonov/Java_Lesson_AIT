package hw_37_app;

import java.util.Comparator;

public class ProductComparators {
    public static Comparator<Product> byPriceAsc = Comparator.comparingDouble(Product::getPrice);
    public static Comparator<Product> byPriceDesc = Comparator.comparingDouble(Product::getPrice).reversed();
    public static Comparator<Product> byRating = Comparator.comparingDouble(Product::getRating).reversed();
    public static Comparator<Product> byStock = Comparator.comparingInt(Product::getStock).reversed();
}