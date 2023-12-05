package ma.devboss.wildcards_V_2;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello java fonctional");
        DataProvider dataProvider = new PersonDataProvider();
        List<Person> people  = (List<Person>) dataProvider.provide();
        people.forEach(System.out::print);
    }

}
