package ma.devboss.functionalInterfaces.streams;

import java.util.List;
public class _Reduce {
    public static void main(String[] args) {
        List<Double> temperatures = List.of(12.3,15.7,20.1,23.9,25.2,27.5,29.2,27.9,25.8,23.2,20.7);
        Double sum = temperatures.stream().reduce(Double::sum).get();
        Double mediumT = sum / temperatures.size();
        System.out.println(sum.floatValue());
        System.out.println(mediumT);
    }
}
