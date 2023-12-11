package ma.devboss.generics_3;

public class Client {
    public static void main(String[] args) {
        getProductInfo(new ProductDataProvider());
    }



    public static void getProductInfo(DataProvider<Product> dataProvider){
        System.out.println("######### About All Products ########");
        dataProvider.provideData()
                .forEach(System.out::println);
    }
}
