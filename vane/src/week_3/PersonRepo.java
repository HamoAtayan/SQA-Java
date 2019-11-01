package week_3;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class PersonRepo {
    public static String[] names = {"Vane", "Nane", "Mane"};
    public static String[] company = {"Webb", "Google", "Apple"};

    public static Person[] getData() {
        Person[] persons = new Person[10];

        for (int i = 0; i < persons.length; i++) {
            Person person = new Person();
            person.name = names[(int) (Math.random() * 3)];
            person.age = (int) (Math.random() * 100);
            person.company = company[(int) (Math.random() * 3)];
            persons[i] = person;
        }
        return persons;
    }
}
