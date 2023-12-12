package ma.devboss.generics_3;

import org.jetbrains.annotations.NotNull;

public class Client {
    public static void main(String[] args) {
        getProductInfo(new ProductDataProvider());
    }



    public static void getProductInfo(@NotNull DataProvider<Product> dataProvider){
        System.out.println("######### About All Products ########");
        dataProvider.provideData()
                .forEach(System.out::println);
    }
}
