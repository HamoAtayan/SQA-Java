package src.Week_3.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        person persons[] =personRepo.getData();
        person.arrayToString(persons);
        System.out.println();
        System.out.println("People working in requested company are:");
        person.arrayToString(personAPI.getPersonsInCompany(persons,"Chargoon"));
        System.out.println("List of oldest people:");
        person.arrayToString(personAPI.getOldestPerson(persons));
        System.out.println("List of youngest people:");
        person.arrayToString(personAPI.getYoungestPersons(persons));
    }
}
