package ma.devboss.functionalInterfaces.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Map {
    public static void main(String[] args) {
        List<Product> productList = ProductDataProvider.productList;
        Set<String> categories = productList.stream().map(Product::getCategory).collect(Collectors.toSet());
        System.out.println(categories);

    }
}
