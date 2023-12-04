package ma.devboss.wildcards;

import java.util.List;

public class WildCards {
    // <?> any object


    // <? extends SomeClass> /*  Upper bound */ ===> SomeClass object itself or any class extends or implement SomeClass but not the ParentClasses
    // ********* [From SomeClass To the last Child]


    // <? super Some Class>  /*  Lower bound */ ===> SomeClass object itself or the classes that its implement but not the subclasses that implement SomeClass
    // ********* [From SomeClass To the First Parent]



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
