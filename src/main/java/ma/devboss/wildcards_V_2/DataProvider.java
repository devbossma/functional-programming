package ma.devboss.wildcards_V_2;

import java.util.List;

public abstract class DataProvider {
    private  List<? extends Entity> dataList;
    public DataProvider() {}
    public abstract List<? extends  Entity> provide();
}
