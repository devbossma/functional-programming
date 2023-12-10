package ma.devboss.generics_2;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        showData(new PersonDataProvider());
    }
    public static void showData(DataProvider<Person> data){
        List<Person> people  = data.provide();
        people.forEach(System.out::print);
    }
}
