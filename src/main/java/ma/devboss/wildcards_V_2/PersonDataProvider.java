package ma.devboss.wildcards_V_2;

import java.util.List;

public class PersonDataProvider extends DataProvider {
   private final Data data = new PersonData();
    public PersonDataProvider() {}

    @Override
    public List<? extends Entity> provide() {
        return this.data.getData();
    }
}
