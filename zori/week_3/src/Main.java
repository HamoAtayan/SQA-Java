import java.util.Arrays;

/**
 * Created by Zori Sargsyan on Oct, 2019
 */

public class Main {
    static final String[] NAMES = {"Karen", "Armen", "Davit", "Vardan", "Aren", "Gayane", "Sona", "Nare", "Arevik", "Garnik"};
    static final String[] COMPANIES = {"Webb Fontaine", "Instigate", "Synopsys", "Epam", "Synergy"};

    public static void main(String[] args) {
        Person[] persons = new Person[10];
        for (int i = 0; i < persons.length; ++i) {
            persons[i] = new Person(getRandomName(), getRandomCompany(), getRandomAge());
            persons[i].print();
        }

        System.out.println(String.format("%s colleagues are:", COMPANIES[0]));
        Person[] colleagues = getColleagues(persons, COMPANIES[0]);
        for (int i = 0; i < colleagues.length; ++i) {
            colleagues[i].print();
        }

        System.out.println("--------------------------------");
        Person theOldestPerson = getTheOldestPerson(persons);
        System.out.println("The oldest person is:");
        theOldestPerson.print();

        System.out.println("--------------------------------");
        Person theYoungestPerson = getTheYoungestPerson(persons);
        System.out.println("The youngest person is:");
        theYoungestPerson.print();

        System.out.println("--------------------------------");
        int mostRepeatedAge = getMostRepeatedAge(persons);
        System.out.println(String.format("The most repeated age is %d", mostRepeatedAge));

        System.out.println("--------------------------------");
        Person[] sortedByAge = sortByAgeAscendingOrder(persons);
        for (Person person : sortedByAge) {
            person.print();
        }

        System.out.println("--------------------------------");
        Person[] sortedByName = sortByName(persons);
        for (Person person : sortedByName) {
            person.print();
        }

        System.out.println("--------------------------------");
        Person[] sortedByCompany = sortByCompany(persons);
        for (Person person : sortedByCompany) {
            person.print();
        }

        System.out.println("--------------------------------");
        persons[5] = persons[2];
        Person duplicatePerson = getDuplicatePerson(persons);
        if (null != duplicatePerson){
            duplicatePerson.print();
        } else {
            System.out.println("There is not duplicate persons in the matrix");
        }

    }

    public static void printMatrix(int[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(String.format("%s ", matrix[i]));
        }
    }

//    exercise 1
    public static int[] doubleMatrix(int[] matrix) {
        int[] doubledMatrix = new int[matrix.length];
        for (int i = 0; i < matrix.length; ++i) {
            doubledMatrix[i] = matrix[i] * 2;
        }
        return doubledMatrix;
    }

//    exercise 2
    public static String[] doubleMatrix(String[] matrix) {
        String[] doubledMatrix = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            doubledMatrix[i] = String.format("%s%s", matrix[i], matrix[i]);
        }
        return doubledMatrix;
    }

//    exercise 3
    public static String[] removeX(String[] matrix) {
        String[] withoutX = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            withoutX[i] = matrix[i].replaceAll("x", "").replaceAll("X", "");
        }
        return withoutX;
    }

//    exercise 4
    public static String[] excludeLongWords(String[] matrix, int maxLength) {
        String[] filteredMatrix = new String[matrix.length];
        int currentIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length() < maxLength) {
                filteredMatrix[currentIndex] = matrix[i];
                ++currentIndex;
            }
        }
//        This is for excluding null objects from the array. I could do it by creating new matrix with currentIndex
//        length and copy this array to it, but I used Arrays.copyOf() method just for speed up, as it isn't the meaning
//        of the exercise
        return Arrays.copyOf(filteredMatrix, currentIndex);
    }

//    exercise 5
    public static int[] combineMatrices(int[] matrix1, int[] matrix2) {
        int[] combinedMatrix = new int[matrix1.length + matrix2.length];
        for (int i = 0; i < matrix1.length; ++i) {
            combinedMatrix[i] = matrix1[i];
        }
        int matrix1Length = matrix1.length;
        for (int i = 0; i < matrix2.length; ++i) {
            combinedMatrix[ matrix1Length + i] = matrix2[i];
        }
        return combinedMatrix;
    }

//    exercise 5
    public static double sumOfMatricesArithmeticAverage(int[] matrix1, int[] matrix2) {
        return matricesArithmeticAverage(matrix1) + matricesArithmeticAverage(matrix2);
    }

//    helper method to count matrix arithmetic average
    public static double matricesArithmeticAverage(int[] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i];
        }
        return (double) sum / matrix.length;
    }

//    exercise 6
    public static double[] increaseElementByTenPercent(double[] matrix, int indexToIncrease) {
        matrix[indexToIncrease] += matrix[indexToIncrease] * 0.1;
        return matrix;
    }

//    exercise 7
    public static int fibonacci(int n) {
        if (n > 2) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else {
            return 1;
        }
    }

//    exercise 8
    public static int productNumbersFromOneToN(int n) {
        return  (n > 1)? n * productNumbersFromOneToN(n-1) : 1;
    }

//   exercise 9.1
    public static Person[] getColleagues(Person[] persons, String company) {
        Person[] colleagues = new Person[persons.length];
        int colleguesIndex = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getCompany() == company) {
                colleagues[colleguesIndex] = persons[i];
                ++colleguesIndex;
            }
        }
        return Person.cut(colleagues, colleguesIndex);
    }

//    exercise 9.2
    public static Person getTheOldestPerson(Person[] persons) {
        Person theOldestPerson = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if (theOldestPerson.getAge() < persons[i].getAge()) {
                theOldestPerson = persons[i];
            }
        }
        return theOldestPerson;
    }

//    exercise 9.3
    public static Person getTheYoungestPerson(Person[] persons) {
        Person theYoungestPerson = persons[0];
        for (int i = 0; i < persons.length; i++) {
            if (theYoungestPerson.getAge() > persons[i].getAge()) {
                theYoungestPerson = persons[i];
            }
        }
        return theYoungestPerson;
    }

//    exercise 9.4
    public static int getMostRepeatedAge(Person[] persons) {
        int maxAge = persons[0].getAge();
        for (Person person : persons) {
            if (maxAge < person.getAge()) {
                maxAge = person.getAge();
            }
        }

        int[] ages = new int[maxAge+1];
        for (int i = 0; i < persons.length; i++) {
            ages[persons[i].getAge()] +=1;
        }
        int mostRepeatedAge = 0;
        for (int i = 0; i < maxAge; i++) {
            if (ages[mostRepeatedAge] < ages[i]) {
                mostRepeatedAge = i;
            }
        }
        return mostRepeatedAge;
    }

//    exercise 9.5
    public static Person[] sortByAgeAscendingOrder(Person[] persons) {
        for (int i = 0; i < persons.length-1; ++i) {
            for (int j = i + 1; j < persons.length; ++j) {
                if (persons[i].getAge() > persons[j].getAge()) {
                    Person yongPerson = persons[j];
                    persons[j] = persons[i];
                    persons[i] = yongPerson;
                }
            }
        }
        return persons;
    }

//    exercise 9.6
    public static Person[] sortByName(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].getName().compareTo(persons[j].getName()) > 0) {
                    Person tmp = persons[j];
                    persons[j] = persons[i];
                    persons[i] = tmp;
                }
            }
        }
        return persons;
    }

//    exercise 9.7
    public static Person[] sortByCompany(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].getCompany().compareTo(persons[j].getCompany()) > 0) {
                    Person tmp = persons[j];
                    persons[j] = persons[i];
                    persons[i] = tmp;
                }
            }
        }
        return persons;
    }

//    exercise 9.8
    public static Person getDuplicatePerson(Person[] persons) {
        for (int i = 0; i < persons.length - 1; ++i) {
            for (int j = i + 1; j <persons.length; ++j) {
                if (persons[i].equals(persons[j])){
                    return persons[i];
                }
            }
        }
        return null;
    }

    public static String getRandomName() {
        return NAMES[(int) (Math.random() * 10)];
    }

    public static String getRandomCompany() {
        return COMPANIES[(int) (Math.random() * 5)];
    }

    public static int getRandomAge() {
        return 18 + (int) (Math.random() * 40);
    }
}
