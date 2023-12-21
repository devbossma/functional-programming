package ma.devboss.functionalInterfaces.streams;

public class _ParallelStream {
    public static void main(String[] args) {
        ProductDataProvider.productList.parallelStream().map(Product::getName).forEach(System.out::println);
    }
}
