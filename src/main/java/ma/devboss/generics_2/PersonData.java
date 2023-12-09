package ma.devboss.generics_2;

import java.util.List;

import static ma.devboss.generics_2.Gender.FEMALE;
import static ma.devboss.generics_2.Gender.MALE;


public final class PersonData implements Data<Person> {
    private final List<Person> peopleData;
    public PersonData() {
        peopleData = List.of(
                new Person("Yassine", MALE),
                new Person("Layla",FEMALE ),
                new Person("Mohamed", MALE),
                new Person("Ayman", MALE),
                new Person("Hoda",FEMALE ),
                new Person("Nada",FEMALE ),
                new Person("Ayoub", MALE),
                new Person("Hanan",FEMALE ),
                new Person("Nour dine", MALE),
                new Person("Zakariya", MALE),
                new Person("Jihane",FEMALE ),
                new Person("Ghizlane",FEMALE ),
                new Person("Abu Baker", MALE)
        );
    }

    @Override
    public List<Person> getData() {
        return this.peopleData;
    }
}
