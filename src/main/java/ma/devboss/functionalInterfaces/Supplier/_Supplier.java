package ma.devboss.functionalInterfaces.Supplier;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbUrl.get());

    }
    static Supplier<String> dbHost = () -> "localhost";
    static Supplier<String> dbPort = () -> "4036";
    static Supplier<String> getDbUrl = () -> "jdbc://".concat(dbHost.get().concat(":".concat(dbPort.get())));

}
