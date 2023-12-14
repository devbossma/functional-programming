package ma.devboss.functionalInterfaces.Predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        String name = "yassine";
        System.out.println(notEmpty.test(name));
        System.out.println(notBlank.test(name));
        System.out.println(FieldNotEmpty.test(name));

    }
    static Predicate<String> notEmpty = s->!s.isEmpty();
    static Predicate<String> notBlank = s->!s.isBlank();
    static  Predicate<String> FieldNotEmpty = notEmpty.and(notBlank);



}
