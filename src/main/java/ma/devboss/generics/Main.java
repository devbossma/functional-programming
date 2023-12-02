package ma.devboss.generics;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Main<T> {
    public static void main(String[] args) {


        Integer[] numbers= {1,2,3,4,5,6,7,8,9};
        Double[] doubles ={1.10,2.21,3.32,4.43};
        Character[] characters = {'a','b','c','d'};
        String[] strings = {"APPLE", "Banana", "orange"};
        // ******* NONE GENERIC APPROACH *******
        System.out.println("******* NONE GENERIC APPROACH *******");
        //intArrayDisplaying(numbers);
        //doubleArrayDisplaying(doubles);
        //characterArrayDisplaying(characters);
        //stringArrayDisplaying(strings);

        // ******* GENERIC METHOD APPROACH *******
        System.out.println("******* GENERIC APPROACH *******");
        arrayDisplay(numbers);
        arrayDisplay(doubles);
        arrayDisplay(characters);
        arrayDisplay(strings);
        // ******* GENERIC METHOD WITH RETURN APPROACH *******
        //System.out.println("******* GENERIC METHOD WITH RETURN APPROACH *******");
        //System.out.println(getFirst(numbers));
        //System.out.println(getFirst(doubles));
        //System.out.println(getFirst(characters));
        //System.out.println(getFirst(strings));

        // ******* GENERIC CLASSES APPROACH ******

        System.out.println("******* GENERIC CLASSES AND METHOD WITH RETURN APPROACH *******");
        Generic<Integer> IntElement = new Generic<>(1);
        Generic<Double> doubleElement = new Generic<>(1.20);
        Generic<Character> charElement = new Generic<>('m');
        Generic<String> stringElement = new Generic<>("DV56NR20");
        Generic[] GEN = {IntElement, doubleElement,charElement, stringElement};
        List<Generic> GEN_1= List.of(
                new Generic<Integer>(15),
                new Generic<Double>(15.21),
                new Generic<Character>('z'),
                new Generic<String>("yassine")
        );
        //GEN_1.forEach(g->System.out.println(g.getX()));
        System.out.println("**********");
        //getAllX(GEN);


    }

    // ******* NONE GENERIC APPROACH *******
    public static void intArrayDisplaying(Integer[] array){
        for (Integer i:array
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void doubleArrayDisplaying(Double[] array){
        for (Double i:array
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void characterArrayDisplaying(Character[] array){
        for (Character i:array
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void stringArrayDisplaying(String[] array){
        for (String i:array
             ) {
            System.out.print(i.toUpperCase() + " ");
        }
        System.out.println();
    }

    // ******* GENERIC APPROACH *******");
    public static <T> void arrayDisplay(T[] array){
        for (T i: array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    // ******* GENERIC METHOD WITH RETURN APPROACH *******
    public static <T> T getFirst(T[] array){
        return array[0];
    }

    // ******* GENERIC CLASSES APPROACH ******

    public static <T> T runGetX(Generic<T> gnClass){
        return gnClass.getX();
    }
    public static <T> void getAllX(Generic[] array){
        for (Generic g: array
             ) {
            System.out.println(g.getX());
        }
    }







}
