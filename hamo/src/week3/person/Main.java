package week3.person;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class Main {

    public static void main(String[] args) {
        // TODO - implement

        Person persons[] = PersonRepository.getData();
        Person.arrayToString(persons);
        System.out.println();
        Person.arrayToString(PersonsAPI.getPersonsInCompany(persons,"Webb Fontaine"));
        System.out.println();
        System.out.println(PersonsAPI.getOldestPerson(persons));
    }
}
