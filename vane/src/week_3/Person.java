package week_3;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class Person {

    String name;
    String company;
    int age;

    public String toString() {
        return String.format("{name: %s, age:%d, company: %s}", name, age, company);
    }

    public static void arrayToString(Person[] persons) {
        for(Person person : persons) {
            System.out.println("person = " + person);
        }
    }
}
