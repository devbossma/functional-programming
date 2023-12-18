package ma.devboss.functionalInterfaces.streams;


import java.util.function.Predicate;

public class _Filter {
    public static void main(String[] args) {
        /* filtering based on a specific condition or a Predicate */
        Predicate<Product> inStock = Product::getInStock;
        // with stream methode we go up to the abstraction mode
        ProductDataProvider.productList.stream()
                .filter(inStock)
                .filter(p->p.getPrice() > 5000) // we can apply more filters on other filter as well
                .forEach(System.out::println);

    }
}
