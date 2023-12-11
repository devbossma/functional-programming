package ma.devboss.generics_3;


import java.util.List;

public class ProductDataProvider implements DataProvider<Product>{
    private final Data<Product> data;

    public ProductDataProvider() {
        this.data = new ProductDataStore();
    }


    @Override
    public List<Product> provideData() {
        return this.data.getData();
    }
}
