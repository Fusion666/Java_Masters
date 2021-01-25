import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MinimumElement minimumElement = new MinimumElement();
        int number = minimumElement.readInteger();
        int[] arrayFindMin = minimumElement.readElements(number);
        System.out.println("Minimum number from the array is: " + minimumElement.findMin(arrayFindMin));

    }

    public static Scanner scanner = new Scanner(System.in);
}
