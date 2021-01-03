import java.util.Scanner;

public class MinMaxChallenge {
    public static void minMaxNumber() {
        int buffer = 0;
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter a number.");
            boolean isNumber = scanner.hasNextInt();
            if(isNumber) {
                int number = scanner.nextInt();
                min = buffer;
                max = buffer;
                if(max <= number) {
                    max = number;
                }
                if(min >= number) {
                    min = number;
                }
                buffer = number;
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Result: ");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        scanner.close();
    }
}
