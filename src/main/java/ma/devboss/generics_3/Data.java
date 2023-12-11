package ma.devboss.generics_3;

import java.util.List;

public interface Data <T extends Entity>{
    List<T> getData();
}
