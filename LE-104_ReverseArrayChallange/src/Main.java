import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myNotReversedArray = createArray(6);
        int[] myReversedArray = createReverseArray(myNotReversedArray);
        System.out.println("The entered Array is: " + Arrays.toString(myNotReversedArray));
        System.out.println("The reversed Array is: " + Arrays.toString(myReversedArray));
    }

    private static int[] createArray(int count) {
        int[] notReverseArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number: ");
            notReverseArray[i] = scanner.nextInt();
        }
        return notReverseArray;
    }

    private static int[] createReverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        int reverseElementOfGivenArray = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[reverseElementOfGivenArray];
            reverseElementOfGivenArray--;
        }
        return reverseArray;
    }
}
