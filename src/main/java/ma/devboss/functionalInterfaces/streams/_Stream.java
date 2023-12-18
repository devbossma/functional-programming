package ma.devboss.functionalInterfaces.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Stream {
    public static void main(String[] args) {
        List<Product> productList = ProductDataProvider.productList;


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
