package ma.devboss.impirative_vs_declarative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Yassine", Gender.MALE),
                new Person("Mohamed", Gender.MALE),
                new Person("Ayman", Gender.MALE),
                new Person("Hoda", Gender.FEMALE),
                new Person("Nada", Gender.FEMALE),
                new Person("Salah", Gender.MALE),
                new Person("Layla", Gender.FEMALE)

        );
        //  filtering female people with Impirative approach:
        List<Person> female_list = new ArrayList<>();
        List<Person> male_list = new ArrayList<>();
        for (Person p : people){
            if (p.gender == Gender.FEMALE) female_list.add(p);
            if (p.gender == Gender.MALE) male_list.add(p);
        }
        //System.out.println(female_list);
        //System.out.println(male_list);

        //  filtering female people with Declarative approach:
        people.stream()
                .filter(p -> Gender.FEMALE.equals(p.gender))
                .toList()
                .forEach(System.out::print);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person\n{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}'+'\n';
        }
    }

    public enum Gender {
        MALE, FEMALE

    }
}
