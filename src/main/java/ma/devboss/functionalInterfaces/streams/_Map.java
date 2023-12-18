package ma.devboss.functionalInterfaces.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Map {
    public static void main(String[] args) {
        List<Product> productList = ProductDataProvider.productList;
//        System.out.println(productList);

        Set<String> categories = productList.stream()
                .map(Product::getCategory)
                .collect(Collectors.toSet());
//      System.out.println(categories);



        List<Product> promotions = productList.stream()
                .filter(Product::getInStock)
                .filter(product -> product.getPrice() > 6_000d)
                .map(product -> new Product(product.getName(),
                        product.getCategory(), product.getPrice() - 100d,
                        product.getInStock()))
                .toList();
//        System.out.println(promotions);
    }
}
