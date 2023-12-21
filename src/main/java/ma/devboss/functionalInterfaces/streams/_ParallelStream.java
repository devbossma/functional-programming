package ma.devboss.functionalInterfaces.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class _ParallelStream {
    public static void main(String[] args) {
//        one Stream is attached to the collection
        Stream<String> stringStream = ProductDataProvider.productList.stream().map(Product::getName);
//                stringStream.forEach(System.out::println);

//        multiple streams attached to the collection so the parallel provides a better performance
        Stream<String> stringStreamParallel = ProductDataProvider.productList.parallelStream().map(Product::getName);
//                stringStreamParallel.forEach(System.out::println);



    }
}
