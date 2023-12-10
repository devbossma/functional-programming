package ma.devboss.generics_2;

import java.util.List;

public abstract class DataProvider<T>{
    public DataProvider() {}
    public abstract List<T> provide();
}
