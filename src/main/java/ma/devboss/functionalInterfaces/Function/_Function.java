package ma.devboss.functionalInterfaces.Function;

import java.util.function.Function;

public class _Function {
    // Function<T,R> : Represents a function that accepts one Argument (T arg1) and produces a Result (R result)
    public static void main(String[] args) {
        Function<Integer, Integer> incrementer = n -> n+1;
        Integer i = incrementer.apply(1);
        System.out.println(i);
    }
}
