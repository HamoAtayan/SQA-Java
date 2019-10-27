package src.Week_3.Person;

public class personRepo {
    static String[] companies = {"Pixar","Webb", "Google", "Microsoft", "Apple", "Picsart"};
    static String[] names = {"Alan","Bradley", "Carol", "Drake", "Fabio", "Gary"};


        public static person[] getData() {
            person[] persons = new person[10];
            for (int i = 0; i < persons.length; i++) {
                person person = new person();
                person.name = names[(int) (Math.random() * 6)];
                person.company = companies[(int) (Math.random() * 6)];
                person.age = (int) (Math.random() * 100);
                persons[i] = person;
            }
            return persons;
        }
    }
