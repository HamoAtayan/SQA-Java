package week3.person;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class PersonsAPI {

    public static Person[] getPersonsInCompany(Person[] persons, String company) {
        Person[] companyPersons = new Person[getLength(persons, company)];

        int i = 0;
        for (Person person : persons) {
            if (person != null && person.company.equals(company)) {
                companyPersons[i] = person;
                i++;
            }
        }

        return companyPersons;
    }

    public static int getLength(Person[] persons, String value) {
        int length = 0;
        for (Person person : persons) {
            if (person != null && person.company.equals(value)) {
                length++;
            }
        }
        return length;
    }

    public static Person getOldestPerson(Person[] persons) {
        int oldest = 1;
        int oldestIndex = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age > oldest) {
                oldest = persons[i].age;
                oldestIndex = i;
            }
        }
        return persons[oldestIndex];
    }

}


