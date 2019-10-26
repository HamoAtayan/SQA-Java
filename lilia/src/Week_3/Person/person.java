package src.Week_3.Person;

public class person {
    String name;
    String company;
    int age;


    public String toString(){
        return String.format("{ name: %s, age: %d, company: %s }", name, age, company);
    }
    public static void arrayToString(person[] persons) {
            for (person person : persons) {
                System.out.println(person);
            }
        }
    }
