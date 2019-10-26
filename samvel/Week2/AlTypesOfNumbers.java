package Week3;

public class AlTypesOfNumbers {
    public static void main (String[] args) {
        int evenCounter = 0;
        int oddCounter = 0;
        int primeCounter = 0;
        boolean statusFlag = false;
        int[] randomArray = new int[20];
        int[] evenArray = new int[20];
        int[] oddArray = new int[20];
        int[] primeArray = new int[20];

         for (int i=0; i<randomArray.length; i++) {
            randomArray[i] = (int)(Math.random()*10);
            for (int counter = 2; counter < randomArray[i]/2; counter++) {
                if (randomArray[i]%counter == 0) {
                    statusFlag = true;
                    break;
                }
            }
            if (!statusFlag) {
                primeArray[primeCounter] = randomArray[i];
                primeCounter++;
            }
            if (randomArray[i]%2 == 0) {
                evenArray[evenCounter] = randomArray[i];
                evenCounter++;
            } else if (randomArray[i]%2 != 0) {
                oddArray[oddCounter] = randomArray[i];
                oddCounter++;
            }
        }

         System.out.print("Here is the even array: ");
         for (int i = 0; i<evenArray.length; i++) {
             System.out.print(" {" + evenArray[i] + "} ");
         }

         System.out.println("Here is the odd array: ");
         for (int i=0; i<oddArray.length; i++) {
             System.out.print(" {" +oddArray[i] + "} ");
         }

        System.out.println("Here is the prime array: ");
        for (int i=0; i<primeArray.length; i++) {
            System.out.print(" {" +primeArray[i] + "} ");
        }

    }
}
