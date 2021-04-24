import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contactsList = new ArrayList<Contact>();
    Scanner scanner = new Scanner(System.in);

    private void addContact() {
        System.out.println("Please enter the contact list name");
        contactsList.add(new Contact(scanner.nextLine(),scanner.nextLine()));
    }

    // this method is used to find a string item from our contacts
    private int findContactItem(String searchContactItem) {
        return contactsList.indexOf(searchContactItem);
    }


    public void menu() {

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
                    printList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
//                    deleteContact();
                    break;
                case 5:
//                    searchContact();
                    break;
                case 6:
                    quit = true;
                default:
                    System.out.println("You can only choose options from 0 to 6. Please choose a valid option");
                    break;
            }
        }
    }
    private void printChoice() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To update a contact - rename and/or change name / number.");
        System.out.println("\t 4 - To delete a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list");
        System.out.println("\t 6 - To quit application");
    }

    private void printList() {
        System.out.println("You have " + contactsList.size() + " contacts in the list");
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println((i + 1) + " ." + contactsList.get(i));
        }
    }

    private boolean onFile(String searchItem) {
        int position = findContactItem(searchItem);
        return position >= 0;
    }

    private void updateContact(String contactName, String newContactName, String newContactNumber) {
        System.out.println("Please enter the contact name you would like to update");
        String currentName = scanner.nextLine();
        System.out.println("Enter the new contact name: ");
        String newName = scanner.next();
        System.out.println("Enter the new contact number");
        String newNumber = scanner.next();
        updateContactItems(currentName,newName,newNumber);
    }

    private void updateContactItems(String contactName, String newContactName, String newContactNumber) {
        int position = findContactItem(contactName);
        if (position >= 0) {
            contactsList.set(position, new Contact(newContactName, newContactNumber));
        }
        else {
            System.out.println("Contact not found with the name " + contactName);
        }
    }

}

