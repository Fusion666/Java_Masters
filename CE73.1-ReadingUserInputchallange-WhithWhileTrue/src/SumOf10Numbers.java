import java.util.Scanner;

public class SumOf10Numbers {
    public static int sumOf10Numbers() {
        Scanner scanner = new Scanner(System.in);

        int numberCounter = 0;
        int sumOfNumbers = 0;

        while(true) {
            System.out.println("Please enter number# " + (numberCounter + 1) + ":");
            boolean isNumber = scanner.hasNextInt();
            if(isNumber) {
                int number = scanner.nextInt();
                sumOfNumbers += number;
                numberCounter++;
                //System.out.println(sumOfNumbers);
                if(numberCounter == 10)
                    break;
            }
            else {
                System.out.println("Invalid number.");
                //scanner.nextLine();
            }
            scanner.nextLine();
        }
        scanner.close();
        return sumOfNumbers;
    }
}
