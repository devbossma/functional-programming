package ma.devboss.functionalInterfaces.Function;


import java.util.function.BiFunction;

public class _BiFunction {
    // BiFunction<T,U,R> Represents a function that accepts two arguments and produces a result.
    // This is the two-arity specialization of Function.
    public static void main(String[] args) {
        System.out.println(TeqTd.apply(100, 100));
        System.out.println(TdValid.apply(100, 90));

    }
    static BiFunction<Integer,Integer,Boolean> TeqTd = Integer::equals;
    static BiFunction<Integer,Integer,Boolean> TdValid = (T, Td)-> Td <= T;


}
