package ma.devboss.functionalInterfaces.streams;

import java.util.Comparator;

public class _Sorted {
    public static void main(String[] args) {
//        default sort wil bbe ascending in order to revers the sorting order use reversed() method
        ProductDataProvider.productList.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).limit(4).forEach(System.out::println);
        ProductDataProvider.productList.stream().sorted(Comparator.comparing(Product::getName)).limit(4).forEach(System.out::println);
    }
}
