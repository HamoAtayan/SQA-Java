package week3.person;

/**
 * Created by: Hmayak on Oct, 2019
 * <p>
 * Ունենք Person class որն ունի անուն, աշխատավայր եւ տարիք։
 * Գրել ֆունկցիա, որը տրված մարդկանց զանգվածից կառանեձնեցնի
 * - այն մարդկանց ովքեր աշխատում են պարամետրով փոխանցված աշխատավայրում +
 * - ամենատարեց եւ ամենաերիտասարդ մարդուն +
 * - բոլոր մարդկանց տարիքներից կվերադարձնի ամենաշատ կրկնվող տարիքը
 * - կսորտավորի մարդկանց. ըստ տարիքի
 * - կսորտավորի մարդկանց. ըստ անունի
 * - կսորտավորի մարդկանց. ըստ աշխատատեղի
 * - կվերադարձնի կրկնվող մարդուն կամ մարդկանց (այսինքն, ընդունենք, որ  կարա նույն մարդը կարա կրկնվի զանգվածում) use compare() method
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

    public static Person getYoungestPerson(Person[] persons) {
        int youngest = 25;
        int youngestIndex = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age < youngest) {
                youngest = persons[i].age;
                youngestIndex = i;
            }
        }
        return persons[youngestIndex];
    }




}




