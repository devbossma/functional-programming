package ma.devboss.wildcards;

import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        DataProvider pd = new PeopleDataProvider();
        pd.provide().forEach(System.out::print);
    }
}
