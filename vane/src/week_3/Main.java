package week_3;

import java.util.Arrays;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class Main {
    public static void main(String[] args) {
        Person[] persons = PersonRepo.getData();
        Person.arrayToString(persons);
        System.out.println();
        Person.arrayToString(PersonApi.getPeopleWorkingInCompany(persons,"Webb"));
        System.out.println();
        System.out.println(PersonApi.getOldest(persons));
        System.out.println(PersonApi.getYoungest(persons));
    }
}
