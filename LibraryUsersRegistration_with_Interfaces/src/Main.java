import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChildClient child1 = new ChildClient("Stan", "Kolev", 2006, 1234);
        child1.setId(12345);
        saveObject(child1);
//        loadObject(child1);

        ChildClient child2 = new ChildClient("Simon", "Enigma", 2018, 66618);
        child2.setId(18666);
        saveObject(child2);

        AdultClient adultClient1 = new AdultClient("Tim", "Buchalka", 1970, 77712);
        saveObject(adultClient1);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(adultClient1);
    }


    public static ArrayList<String> readValuesLibraryClients() {
        ArrayList<String> valuesLibraryClients = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit\n");
        while (!quit) {
            System.out.println("Choose an option: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    valuesLibraryClients.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return valuesLibraryClients;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> valuesToLoad = readValuesLibraryClients();
        objectToLoad.read(valuesToLoad);
    }
}
