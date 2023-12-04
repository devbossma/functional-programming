package ma.devboss.wildcards_V_2;


import ma.devboss.wildcards_V_2.Gender;

import java.util.UUID;
public class Person implements Entity{
    private String name;
    private String id;
    private Gender gender;

    public Person() {
        this.id = UUID.randomUUID().toString();
    }

    public Person(String name, Gender gender) {
        this();
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                '}'+'\n';
    }
}
