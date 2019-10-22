package week3.person;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class PersonRepository {
    public static Person[] getData() {
        Person [] person = new Person[2];

        Person person1 = new Person("hamo", "wfa", 26);
        Person person2 = new Person("Vahram", "wfa", 28);
        return person;
    }
}
