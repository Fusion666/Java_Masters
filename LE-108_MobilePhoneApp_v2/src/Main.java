import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone  mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        printChoice();

        while (!quit) {
            System.out.println("\t\t Choose an option from the list: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printChoice();
                    break;
                case 1:
                    mobilePhone.printList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                default:
                    System.out.println("You can only choose options from 0 to 6. Please choose a valid option");
                    break;
            }
        }

    }

    private static void addContact() {
        System.out.println("Please enter the contact list name");
        String contactName = scanner.nextLine();
        System.out.println("Please enter the contact list number");
        String contactNumber = scanner.nextLine();
        mobilePhone.addContact(contactName, contactNumber);

    }

    private static void printChoice() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To update a contact - rename and/or change name / number.");
        System.out.println("\t 4 - To delete a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list");
        System.out.println("\t 6 - To quit application");
    }


    private static void updateContact() {
        System.out.println("Please enter the contact name you would like to update");
        String currentName = scanner.nextLine();
        System.out.println("Enter the new contact name: ");
        String newName = scanner.next();
        System.out.println("Enter the new contact number");
        String newNumber = scanner.next();
        mobilePhone.updateContactItems(currentName,newName,newNumber);
    }

    private static void deleteContact() {
        System.out.println("Please enter the name of the contact you would like to be deleted: ");
        String nameOfContact = scanner.nextLine();
        mobilePhone.deleteContact(nameOfContact);
    }

    private static void searchContact() {
        System.out.println("Enter the name of the contact you are searching for");
        String nameOfSearchContact = scanner.nextLine();
        if (mobilePhone.onFile(nameOfSearchContact)) {
            System.out.println("Found: " + nameOfSearchContact);
        }
        else {
            System.out.println("Name not found in your list of Contacts.");
        }
    }
}
