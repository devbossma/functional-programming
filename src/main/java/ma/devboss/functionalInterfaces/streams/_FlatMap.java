package ma.devboss.functionalInterfaces.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _FlatMap {
    public static void main(String[] args) {
        List<List<Product>> allProductLists = ProductDataProvider.allProducts;
        allProductLists.stream()
                .flatMap(pl->pl.stream()
                        .filter(Product::getInStock)
                        .filter(product -> product.getPrice() >6_000))
                .toList().forEach(System.out::println);

        Set<String> Categories = allProductLists.stream()
                .flatMap(listProducts -> listProducts.stream()
                        .map(Product::getCategory))
                .collect(Collectors.toSet());
        System.out.println(Categories);


    }
}
