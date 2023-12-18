package ma.devboss.functionalInterfaces.streams;

import java.util.List;

public class ProductDataProvider {
    public  static final List<Product> productList = List.of(
            new Product("HP EliteBook 840 G5", "Computers", 4800.97, true),
            new Product("HP Laser E65", "Printer", 2800.97, true),
            new Product("HP EliteBook 860 G8", "Computers", 5000.85, false),
            new Product("Iphone 15pro", "Mobile", 25000.85, true),
            new Product("Iphone 14pro", "Mobile", 15000.85, false),
            new Product("Samsung S30", "Mobile", 6000.97, true),
            new Product("Samsung S4", "Mobile", 3500.97, false),
            new Product("Dell Inspiration 15 puce", "Computers", 6500.97, true),
            new Product("Dell Inspiration 13 puce", "Computers", 6500.97, false),
            new Product("SONY 360", "Camera", 4800.97, true),
            new Product("GoPro", "Camera", 600.97, true),
            new Product("Canon", "Camera", 9700.97, false)
    );

}
