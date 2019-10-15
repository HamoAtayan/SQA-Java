package Week3;

import java.util.Scanner;

public class Person {
    String name;
    Integer age;
    String workplace;

    //Set Person details

    public void setPersonName(String personName) {
        name = personName;
    }

    public void setPersonAge(Integer personAge) {
        age = personAge;
    }

    public void setPersonWorkplace(String personWorkplace) {
        workplace = personWorkplace;
    }

    //Function to check if person works in given workplace

    public boolean doesWorkHere (String givenWorkplace) {
        if (workplace.equals(givenWorkplace)) {
            System.out.println(name + " Is working in a place you have mentioned");
            return true;
        }
        else
            System.out.println(name + " is not working in the place you've mentioned ");
        return false;
    }

    //Function to find the oldest person from Persons array

    public static String oldestPerson (Person[] arr) {
        int oldest = 0;
        String oldestName = "";
        for (int i=0; i<arr.length; i++) {
            if (arr[i].age > oldest) {
                oldest = arr[i].age;
                oldestName = arr[i].name;
            }
        }
        System.out.println("The oldest person is: " + oldestName);
        return oldestName;

    }

    //Function to find youngest person

    public static String youngestPerson (Person[] arr) {
        int youngest = arr[0].age;
        String youngestName = "";
        for (int i=0; i<arr.length; i++) {
            if (arr[i].age < youngest) {
                youngest = arr[i].age;
                youngestName = arr[i].name;
            }
        }
        System.out.println("The youngest person is: " + youngestName);
        return youngestName;
    }

    public static void main(String[] args) {

        Person[] listOfPersons = new Person[3];

        //initialize our persons array data from user input

        Scanner userInput = new Scanner(System.in);

        for (int i=0; i<listOfPersons.length; i++) {

            listOfPersons[i] = new Person();

            System.out.println("Enter persons name: ");
            listOfPersons[i].setPersonName(userInput.next());
            System.out.println("Enter persons age: ");
            listOfPersons[i].setPersonAge(userInput.nextInt());
            System.out.println("Enter persons workplace: ");
            listOfPersons[i].setPersonWorkplace(userInput.next());

        }

        //Ask user to input workplace to search if matching

        System.out.println("Please insert a workplace you want to check for a match: ");
        String userWorkplace = userInput.next();

        //Check if there are any matches

        for (int i = 0; i<listOfPersons.length; i++) {
            listOfPersons[i].doesWorkHere(userWorkplace);
        }

        //Call function to return oldest Person from array

        oldestPerson(listOfPersons);

        //Call function to return youngest Person from array

        youngestPerson(listOfPersons);


    }
}
