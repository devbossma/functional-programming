package ma.devboss.wildcards_V_1;


import java.util.List;
import static ma.devboss.wildcards_V_1.Gender.FEMALE;
import static ma.devboss.wildcards_V_1.Gender.MALE;

public class PeopleData implements Data {

    private List<Person> peopleData;

    public PeopleData() {

        peopleData = List.of(
                new Person("Yassine", MALE),
                new Person("Layla",FEMALE ),
                new Person("Mohamed", MALE),
                new Person("Ayman", MALE),
                new Person("Hoda",FEMALE ),
                new Person("Nada",FEMALE ),
                new Person("Salah", MALE)

        );
    }
    @Override
    public List<Person> getData() {
        return peopleData;
    }


}
