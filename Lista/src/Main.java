import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter  your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("You can choose from option 0 to option 6 only!");
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - process arrayList");
        System.out.println("\t 7 - To quit application");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery list item: ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter the item you would like to modify: ");
        String currentItemName = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItemName,newItem);
    }

    public static void removeItem() {
        System.out.println("Please enter the item you would like to be removed: ");
        String itemRemoved = scanner.nextLine();
        groceryList.removeGroceryItem(itemRemoved);
    }

    public static void searchForItem() {
        System.out.print("Enter the grocery list item you would like to be found: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem );
        }
        else {
            System.out.println(searchItem + " is not in the shopping list.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());
        System.out.println(newArray);

//        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

//        String[] myArray = new String[groceryList.getGroceryList().size()];
//        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
