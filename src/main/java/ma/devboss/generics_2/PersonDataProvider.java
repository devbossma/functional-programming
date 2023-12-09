package ma.devboss.generics_2;

import java.util.List;

public class PersonDataProvider extends DataProvider<Person> {
   private final Data<Person> data = new PersonData();
    public PersonDataProvider() {}

    @Override
    public List<Person> provide() {
        return this.data.getData();
    }
}
