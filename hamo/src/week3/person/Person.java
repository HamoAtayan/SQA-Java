package week3.person;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class Person {

    String name;
    String company;
    int age;

    public Person(String name, String company, int age) {
        this.age = age;
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return age;
    }

    public static Person[] cut(Person[] persons, int newMatrixLength) {
        Person[] cutList = new Person[newMatrixLength];
        for (int i = 0; i < newMatrixLength; i++) {
            cutList[i] = persons[i];
        }
        return cutList;
    }

    public boolean equals(Person person) {
        return (this.getAge() == person.getAge() && this.getName().equals(person.getName()) &&
                this.getCompany().equals(person.getCompany()));

    }

    public String toString() {
        return String.format("{name: %s, age: %d, company: %s}", name, age, company);
    }
}
