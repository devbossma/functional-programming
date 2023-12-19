package ma.devboss.functionalInterfaces.streams;

import java.util.Comparator;
import java.util.List;

public class _Distinct {
    public static void main(String[] args) {
//        distinct() avoiding duplicates element in th stream
        List<String> cars = List.of("BMW", "Mercedes", "BMW", "Mercedes","Volkswagen", "Fiat","Dacia", "Volkswagen", "Mercedes", "BMW","Fiat","Dacia","Volkswagen", "Fiat","Dacia");
        cars.stream().distinct().forEach(System.out::println);

//        count() return the size of the final streamed collection
        System.out.println((long) cars.size());
        System.out.println(cars.stream().distinct().count());

//        min() and max() return an optional depending on a specific comparator
        System.out.println(cars.stream().distinct().max(Comparator.comparing(String::length)).isPresent());
        System.out.println(cars.stream().distinct().min(Comparator.comparing(String::length)).isPresent());
//        System.out.println(ProductDataProvider.productList.stream().max(Comparator.comparing(Product::getPrice)).get().getName());
//        System.out.println(ProductDataProvider.productList.stream().min(Comparator.comparing(Product::getPrice)).get().getName());

//        limit() return the required size only starting from the beginning of the streamed collection
        cars.stream().limit(6).forEach(System.out::println);

    }
}
