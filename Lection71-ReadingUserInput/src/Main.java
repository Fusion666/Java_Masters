import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // boolean variable created - true if there are no letters


        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // this function call is used so that the code doesn't execute and skip the data
            //entry after our Int input. The scanner method is searching for a line separator to
            //continue and if it doesn't find it moves on to the end of the program!!!

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            //calculation age part
            if(age > 200 || yearOfBirth < 0) {
                System.out.println("Invalid input. You have entered either a greater year of birth than the current one or a negative birth year or your year of birth is unacceptable - can not be under 1820.");

            }
            else {
                System.out.println("Your name is " + name + " ,and you are " + age + " years old.");
            }

        } else {
            System.out.println("Unable to parse an year of birth.");
        }

        scanner.close();
    }
}
