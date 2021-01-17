import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = getIntegers();
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println("The number for element " + i + " is " + unsortedArray[i] );
        }
        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println("\n\n");
        System.out.println("Sorted array elements are: \n");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("The number for element " + i + " is " + sortedArray[i] );
        }
    }

    public static int[] getIntegers() {
        System.out.println("\nEnter a number of total elements you would like to be sorted!\r");

        Scanner numberTotalElements = new Scanner(System.in);
        //numberTotalElements.next();

        System.out.println("\n Please enter numbers to be sorted!");
        //numberTotalElements.next();

        int numberElementsArray = numberTotalElements.nextInt();
        int[] values = new int [numberElementsArray];
        for (int i = 0; i < values.length; i++) {
            values[i] = numberTotalElements.nextInt();
        }
        return values;
    }

    public static int[] sortIntegers(int[] array) {
        int temporary = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if(array[j] > array [i]) {
                    temporary = array[j];
                    array[j] = array[i];
                    array[i] = temporary;
                }
            }
        }
        return array;
    }


}
