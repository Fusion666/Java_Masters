import java.util.Scanner;

public class MinimumElement {
    private Scanner scanner = new Scanner(System.in);
    public int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public int[] readElements(int count) {

        int[] array = new int[count];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {

            System.out.println("Enter an element number ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public int findMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
