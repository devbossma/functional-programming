package ma.devboss.wildcards;

import ma.devboss.impirative_vs_declarative.Main;

import java.util.List;
import java.util.stream.Collectors;

public class WildCards {
    public static void main(String[] args) {
        DataProvider pd = new PeopleDataProvider();
        List<Person> list = (List<Person>) pd.provide();
        list.stream()
                .filter(person -> Gender.FEMALE.equals(person.getGender()))
                .toList()
                .forEach(System.out::print);
        System.out.println("******************");
        list.stream()
                .filter(person -> Gender.MALE.equals(person.getGender()))
                .toList()
                .forEach(System.out::print);
    }
}
