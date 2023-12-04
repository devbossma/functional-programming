package ma.devboss.wildcards;
import java.util.List;

abstract class DataProvider {
    private Data data;

    public DataProvider(Data data) {
        this.data = data;
    }


    public List<?> provide(){

        return this.data.getData();
    };


}
