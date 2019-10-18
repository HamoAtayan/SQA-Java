package Week3;

import java.util.Scanner;

public class Person {
    String name;
    Integer age;
    String workplace;

    //Set Person details

    public void setPersonName(String name) {
        this.name = name;
    }

    public void setPersonAge(Integer age) {
        this.age = age;
    }

    public void setPersonWorkplace(String workplace) {
        this.workplace = workplace;
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

    //Find most repeating age

    public static int mostRepeatingAge(Person[] arr) {
        int counter = 1, tempCounter;
        int repeatingAge = arr[0].age;
        int temp;
        for (int i=0; i<(arr.length-1); i++) {
            temp = arr[i].age;
            tempCounter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j].age) {
                    tempCounter++;
                }
                if (tempCounter > counter) {
                    repeatingAge = temp;
                    counter = tempCounter;
                }
            }
        }
        System.out.println("Most repeating age in your Persons array is : " + repeatingAge);
        return repeatingAge;
    }

    //Sort Persons by age

    public static void sortByAge (Person[] arr) {
        for (int i = 0; i<arr.length; i++) {
            int minAge = arr[i].age;
            int minId = i;
            Person youngestPerson = arr[i];
            for (int j = i+1; j<arr.length; j++) {
                if (arr[j].age < minAge) {
                    youngestPerson = arr[j];
                    minId = j;
                }
            }
            //Swapping
            Person temp = arr[i];
            arr[i] = youngestPerson;
            arr[minId] = temp;
            System.out.println(arr[i].age);
        }
    }

    //Sort persons by name

    public static void sortByName (Person[] arr) {
        Person temp;
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
                if (arr[i].name.compareTo(arr[j].name) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i].name + " ");
        }
    }

    //Sort by workplace

    public static void sortByWorkplace (Person[] arr) {
        Person temp;
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
                if (arr[i].workplace.compareTo(arr[j].workplace) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i].workplace + " ");
        }
    }

    //Find most repeating name

    public static String mostRepeatingAName(Person[] arr) {
        int counter = 1, tempCounter;
        String repeatingName = arr[0].name;
        String temp;
        for (int i=0; i<(arr.length-1); i++) {
            temp = arr[i].name;
            tempCounter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (temp.equals(arr[j].name)) {
                    tempCounter++;
                }
                if (tempCounter > counter) {
                    repeatingName = temp;
                    counter = tempCounter;
                }
            }
        }
        System.out.println("Most repeating age in your Persons array is : " + repeatingName);
        return repeatingName;
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

        //Check if there are any matches in workplace

        for (int i = 0; i<listOfPersons.length; i++) {
            listOfPersons[i].doesWorkHere(userWorkplace);
        }

        //Call function to return oldest Person from array

        oldestPerson(listOfPersons);

        //Call function to return youngest Person from array

        youngestPerson(listOfPersons);

        //Call function to find most repeating age in array of Persons

        mostRepeatingAge(listOfPersons);

        //Sort persons by age

        sortByAge(listOfPersons);

        //Sort by name

        sortByName(listOfPersons);

        //Sort by workplace

        sortByWorkplace(listOfPersons);

        //Find most repeating name

        mostRepeatingAName(listOfPersons);

    }
}
