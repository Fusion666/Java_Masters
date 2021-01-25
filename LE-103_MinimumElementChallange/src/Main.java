import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] insertedArrayIntegers = readIntegers(5);
        //findMin(insertedArrayIntegers);
        System.out.println("The min value of an element of the typed array is: " + findMin(insertedArrayIntegers));
    }

    private static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer numbers");
        int[] array = new int [count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int temp = array[0];

            for (int i = 0; i < array.length; i++) {
                if (array[i] < temp) {
                    temp = array[i];
                }
            }
        return temp;
    }
}
