package src.Week_3.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        person persons[] =personRepo.getData();
        person.arrayToString(persons);
        System.out.println();
        System.out.println("People working in requested company are:");
        person.arrayToString(personAPI.getPersonsInCompany(persons,"Webb"));
        System.out.println("List of oldest people:");
        person.arrayToString(personAPI.getOldestPerson(persons));
        System.out.println("List of youngest people:");
        person.arrayToString(personAPI.getYoungestPersons(persons));
        System.out.println("The most repeated age is:");
        System.out.println(personAPI.getTheMaxRepeatedAge(persons));
        System.out.println("Sorted by age(Ascending to Descending:");
        person.arrayToString(personAPI.getAscendingSortedByAge(persons));
        System.out.println();
        System.out.println("Sorted by age(Descending to Ascending:");
        person.arrayToString(personAPI.getDescendingSortedByAge(persons));
        System.out.println();
        System.out.println("Sorted by Name:");
        person.arrayToString(personAPI.getSortedByNames(persons));
        System.out.println();
        System.out.println("Sorted by Company:");
        person.arrayToString(personAPI.getSortedByCompanies(persons));
        System.out.println("The Most Repeated Person:");
        System.out.println(personAPI.getTheMostRepeatedPerson(persons));
    }
}
