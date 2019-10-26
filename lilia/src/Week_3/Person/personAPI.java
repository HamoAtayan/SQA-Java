package src.Week_3.Person;

public class personAPI {
    public static person[] getPersonsInCompany(person[] persons, String company) {
        person[] personsCompany = new person[getLength(persons, company)];
        int i = 0;
        for (person person : persons) {
            if (person != null && person.company.equals(company)) {
                personsCompany[i] = person;
                i++;
            }
        }
        return personsCompany;
    }

    public static int getLength(person[] persons, String company) {
        int length = 0;
        for (person person : persons) {
            if (person != null && person.company.equals((company))) {
                length++;
            }
        }
        return length;
    }

    public static int getOldestLength(person[] persons) {
        int oldest = 1;
        for (int i = 0; i < persons.length; i++) {
            if (persons != null && persons[i].age > oldest) {
                oldest = persons[i].age;
            }
        }
            int length = 0;
            for (int i = 0; i < persons.length; i++) {
                if (persons[i].age == oldest) {
                    length++;
                }
            }
        return length;
    }

    public static person[] getOldestPerson(person[] persons) {
        person[] oldestPersons = new person[getOldestLength(persons)];
        int oldest = 1;
        for (int i = 0; i < persons.length; i++) {
            if (persons != null && persons[i].age > oldest) {
                oldest = persons[i].age;
            }
        }
        int index = 0;
        for (int i = 0; i < persons.length; i++) {
            if ( persons[i].age == oldest) {
                oldestPersons[index] = persons[i];
                index++;
            }
        }
        return oldestPersons;
    }
    public static int getYoungestLength (person[] persons){
        int youngest=10;
        for (int i=0;i <persons.length;i++){
            if (persons[i].age<youngest){
                youngest=persons[i].age;
            }
        }
        int length=0;
        for (int i=0;i<persons.length;i++){
            if (persons[i].age==youngest){
                length++;
            }
        }
        return length;
    }
    public static person [] getYoungestPersons (person[] persons){
        person [] youngestPersons=new person[getYoungestLength(persons)];
        int youngest =10;
        for (int i=0;i<persons.length;i++){
            if (persons[i].age<youngest){
                youngest = persons[i].age;
            }
        }
        int index = 0;
        for (int i = 0; i < persons.length; i++) {
            if ( persons[i].age == youngest) {
                youngestPersons[index] = persons[i];
                index++;
            }
        }
        return youngestPersons;
    }

}


