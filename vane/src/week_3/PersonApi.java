package week_3;

/**
 * Created by Vane Gharakhanian on Oct, 2019
 */
public class PersonApi {

    public static Person[] getPeopleWorkingInCompany(Person[] persons, String company) {
        Person[] companyPerson = new Person[getLength(persons, company)];
        int i = 0;
        for (Person person : persons) {
            if (person.company.equals(company)) {
                companyPerson[i] = person;
                i++;
            }
        }
        return companyPerson;
    }

    public static int getLength(Person[] persons, String company) {
        int length = 0;
        for (Person person: persons){
            if (person.company.equals(company)) {
                length++;
            }
        }
        return length;
    }

    public static Person getOldest(Person[] persons) {
        int oldest = 1;
        int oldestIndex = 1;
        for (int i=0; i<persons.length; i++) {
            if (persons[i].age > oldest) {
                oldest = persons[i].age;
                oldestIndex = i;
            }
        }
        return persons[oldestIndex];
    }

    public static Person getYoungest(Person[] persons) {
        int youngest = 100;
        int youngestIndex = 0;
        for (int i=0; i<persons.length; i++) {
            if (persons[i].age < youngest) {
                youngest = persons[i].age;
                youngestIndex = i;
            }
        }
        return persons[youngestIndex];
    }
}
