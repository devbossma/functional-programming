package ma.devboss.functionalInterfaces.streams;

import java.util.Optional;

public class _Find {
    public static void main(String[] args) {
        Optional<Product> any = ProductDataProvider.productList.stream().findAny();
        Optional<Product> first = ProductDataProvider.productList.stream().findFirst();

        System.out.println(any.isPresent() ? any.get() : "COLLECTION IS EMPTY");
        System.out.println(first.isPresent() ? first.get() : "COLLECTION IS EMPTY");

    }
}
