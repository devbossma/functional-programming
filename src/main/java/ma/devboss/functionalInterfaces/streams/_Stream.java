package ma.devboss.functionalInterfaces.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Stream {
    public static void main(String[] args) {
        List<Product> productList = List.of(
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


        // Filter takes a predicate
        List<Product> computersInStock = productList.stream()
                .filter(p -> "Computers".equals(p.getCategory()))
                .filter(Product::getInStock)
                .toList();
//        System.out.println(computersInStock);

        // Map takes a Function
        Set<String> categories = productList.stream()
                .map(Product::getCategory)
                .collect(Collectors.toSet());
//        System.out.println(categories);

        // limit returns a fixed given size for the new stream produced
        List<Product> products = productList.stream().limit(7).toList();
//        System.out.println(products.size());

        // sorted()
        List<Product> sorted = productList.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(3)
                .toList();
        //sorted.forEach(System.out::println);

      //  group
        Map<String, List<Product>> listMap =
                productList.stream().collect(Collectors.groupingBy(Product::getCategory));
        listMap.forEach((c,p)->{
            System.out.println(c);
            p.forEach(System.out::println);
        });

        System.out.println("------------------------------");
        productList.stream()
                .takeWhile(product -> product.getPrice() >= 2_800.97)
                .forEach(System.out::println);


    }
}
