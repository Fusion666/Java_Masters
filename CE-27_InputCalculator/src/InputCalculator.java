import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        boolean isNumber;
        int numberCounter = 0;

        while(true) {
            isNumber = scanner.hasNextInt();
            if(isNumber) {
                int number = scanner.nextInt();
                sum += number;
                numberCounter++;
                avg = Math.round((double)sum / numberCounter);
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
