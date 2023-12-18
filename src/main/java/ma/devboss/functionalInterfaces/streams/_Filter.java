package ma.devboss.functionalInterfaces.streams;

import java.util.List;

public class _Filter {
    public static void main(String[] args) {
        ProductDataProvider.productList.stream()
                .filter(Product::getInStock)
                .forEach(System.out::println);

    }
}
