package ma.devboss.wildcards;


import java.util.List;

public class PeopleData implements Data {

    private List<Person> peopleData;

    public PeopleData() {

        peopleData = List.of(
                new Person("Yassine"),
                new Person("Mohamed"),
                new Person("Ayman"),
                new Person("Hoda"),
                new Person("Nada"),
                new Person("Salah"),
                new Person("Layla")

        );
    }
    @Override
    public List<Person> getData() {
        return peopleData;
    }


}
