package ma.devboss.generics_3;

import java.util.List;

public interface DataProvider<T extends Entity> {
    List<T> provideData();
}
