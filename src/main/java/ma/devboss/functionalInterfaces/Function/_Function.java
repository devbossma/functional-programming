package ma.devboss.functionalInterfaces.Function;

import java.util.function.Function;

public class _Function {
    // Function<T,R> : Represents a function that accepts one Argument (T arg1) and produces a Result (R result)
    public static void main(String[] args) {
        System.out.println(incrementer.apply(1));
        System.out.println(multiplier_10X.apply(1));
        System.out.println(incremultiplayer_10X.apply(1));
    }
    static  Function<Integer, Integer> incrementer = n -> n + 1;
    static  Function<Integer, Integer> multiplier_10X  = n -> n * 10;

    static Function<Integer, Integer> incremultiplayer_10X = incrementer.andThen(multiplier_10X);


}
