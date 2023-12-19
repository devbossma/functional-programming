package ma.devboss.functionalInterfaces.streams;

import java.util.List;

public class _Distinct {
    public static void main(String[] args) {
        List<String> cars = List.of("BMW", "Mercedes", "BMW", "Mercedes","Volkswagen", "Fiat","Dacia", "Volkswagen", "Mercedes", "BMW","Fiat","Dacia","Volkswagen", "Fiat","Dacia");
        cars.stream().distinct().forEach(System.out::println);
        System.out.println(cars.stream().distinct().count());

    }
}
