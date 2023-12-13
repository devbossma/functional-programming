package ma.devboss.functionalInterfaces.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    //Consumer<T>
    //Represents an operation that accepts a single input argument and returns no result.
    // Unlike most other functional interfaces, Consumer is expected to operate via side effects.
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //greeting.accept("Yassine");
        nameToUpperCase.accept("yassine");
        addUpperCaseNamesToTheList.accept("yassin", names);
        addUpperCaseNamesToTheList.accept("hassan", names);
        addUpperCaseNamesToTheList.accept("abdu lah", names);
        addUpperCaseNamesToTheList.accept("layla", names);

        names.forEach(greeting);

    }
    static Consumer<String> greeting = name -> System.out.println("Hello ".concat(name));
    static Consumer<String> nameToUpperCase = name-> System.out.println(name.toUpperCase());
    static BiConsumer<String, List<String>> addUpperCaseNamesToTheList = (name,list)->list.add(name.toUpperCase());




}
