package src.Week_3.Person;

public class personRepo {
    static String[] companies = {"Chargoon", "Webb", "Google", "Microsoft", "Apple", "Raddit"};
    static String[] names = {"Lilia", "Jack", "Jennifer", "Joseph", "sherlock", "Sarah"};


        public static person[] getData() {
            person[] persons = new person[10];
            for (int i = 0; i < persons.length; i++) {
                person person = new person();
                person.name = names[(int) (Math.random() * 6)];
                person.company = companies[(int) (Math.random() * 6)];
                person.age = (int) (Math.random() * 10);
                persons[i] = person;
            }
            return persons;
        }
    }
