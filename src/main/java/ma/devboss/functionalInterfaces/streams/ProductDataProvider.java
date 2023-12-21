package ma.devboss.functionalInterfaces.streams;

import java.util.List;

public class ProductDataProvider {
    public  static final List<Product> productList = List.of(
            new Product("HP EliteBook 840 G5", "Computers", 4800.97, true),
        new Product("HP Laser E65", "Printer", 2800.97, true),
            new Product("HP Laser E65 Color", "Printer", 2800.97, true),
            new Product("HP Laser E65 Graver", "Printer", 2800.97, false),
            new Product("HP EliteBook 860 G8", "Computers", 5000.85, false),
            new Product("Iphone 15pro 16Gb", "Mobile", 25000.85, true),
            new Product("Iphone 14pro 16Gb", "Mobile", 15000.85, false),
            new Product("Iphone 15pro 32Gb", "Mobile", 25000.85, true),
            new Product("Iphone 14pro 32Gb", "Mobile", 15000.85, true),
            new Product("Iphone 15pro 64Gb", "Mobile", 25000.85, false),
            new Product("Iphone 14pro 64Gb", "Mobile", 15000.85, false),
            new Product("Samsung S30", "Mobile", 6000.97, true),
            new Product("Samsung S4", "Mobile", 3500.97, false),
            new Product("Dell Inspiration 15 puce i3", "Computers", 6500.97, true),
            new Product("Dell Inspiration 13 puce i3", "Computers", 6500.97, true),
            new Product("Dell Inspiration 15 puce i5", "Computers", 6500.97, true),
            new Product("Dell Inspiration 13 puce i5", "Computers", 6500.97, false),
            new Product("Dell Inspiration 15 puce i7", "Computers", 6500.97, false),
            new Product("Dell Inspiration 13 puce i7", "Computers", 6500.97, false),
            new Product("SONY 360", "Camera", 4800.97, true),
            new Product("SONY s360", "Camera", 4800.97, false),
            new Product("SONY ss360", "Camera", 4800.97, true),
            new Product("GoPro s1", "Camera", 600.97, false),
            new Product("GoPro s2", "Camera", 600.97, true),
            new Product("GoPro s3", "Camera", 600.97, true),
            new Product("GoPro s4", "Camera", 600.97, true),
            new Product("Canon c530", "Camera", 9700.97, false),
            new Product("Canon c630", "Camera", 9700.97, false)
    );

    public  static final List<Product> computers = productList.stream().filter(p -> "Computers".equals(p.getCategory())).toList();
    public  static final List<Product> printers = productList.stream().filter(p -> "Printer".equals(p.getCategory())).toList();
    public  static final List<Product> mobiles = productList.stream().filter(p -> "Mobile".equals(p.getCategory())).toList();
    public  static final List<Product> cameras = productList.stream().filter(p -> "Camera".equals(p.getCategory())).toList();
    public  static final List<List<Product>> allProducts = List.of(computers, printers, cameras, mobiles);


}
