import java.util.Scanner;

public class Sum10Numbers {
    public static int sumOf10Numbers() {
        Scanner scanner = new Scanner(System.in);

        int numberCounter = 1;
        int sum = 0;


        while(numberCounter <= 10) {
            System.out.println("Please enter number #" + numberCounter);
            boolean isNumber = scanner.hasNextInt();
            if(isNumber) {
                int number = scanner.nextInt();
                numberCounter++;
                sum += number;
                //scanner.nextLine();

            } else {
                System.out.println("Invalid number.");
                scanner.nextLine();

            }
        }

        scanner.close();
        return sum;
    }

}
