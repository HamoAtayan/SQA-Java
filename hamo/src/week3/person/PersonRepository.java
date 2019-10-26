package week3.person;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class PersonRepository {
    static String[] companies = {"Webb Fontaine", "AGS", "Zero", "Google"};
    static String[] names = {"Lilia", "Smbat", "Vahram", "Lilit"};

    public static Person[] getData() {

        Person[] persons = new Person[10];
        for (int i = 0; i < persons.length; i++) {
            Person person = new Person();
            person.name = names[(int)(Math.random()*4)];
            person.company = companies[(int)(Math.random()*4)];
            person.age = (int)((Math.random())*100);
            persons[i] = person;
        }

        return persons;
    }


}
