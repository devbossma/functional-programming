package ma.devboss.generics_3;

import java.util.List;

public class ProductDataStore implements Data<Product>{
    List<Product> productList;
    public ProductDataStore() {
        productList = List.of(
                new Product("phone"),
                new Product("Ipad"),
                new Product("PC"),
                new Product("Key Board"),
                new Product("Mouse")
                );
    }

    @Override
    public List<Product> getData() {
        return productList;
    }
}
