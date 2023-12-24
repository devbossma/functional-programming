package ma.devboss.functionalInterfaces.streams;

import java.util.List;
import java.util.stream.Stream;

public class _Concat {
    public static void main(String[] args) {
        List<Product> electronics = Stream.concat(
                ProductDataProvider.cameras.stream(),
                ProductDataProvider.computers.stream())
                .toList();
        electronics.forEach(System.out::println);

    }
}
