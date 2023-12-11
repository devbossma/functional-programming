package ma.devboss.generics_3;

public class Client {
    public static void main(String[] args) {
        DataProvider<Product> listOfProducts = new ProductDataProvider();
        listOfProducts
                .provideData()
                .forEach(p->System.out.println(p.getName()));

        getProductInfo(new ProductDataProvider());

    }
    public static void getProductInfo(DataProvider<Product> dataProvider){
        System.out.println("#################");
        dataProvider.provideData()
                .forEach(p->System.out.println(p.getName()));
    }
}
