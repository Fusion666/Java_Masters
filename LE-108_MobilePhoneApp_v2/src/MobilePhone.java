import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactsList = new ArrayList<Contact>();

    public void addContact(String name, String number) {  //should be Contact contact -> !!!Contact is of type object
        contactsList.add(new Contact(name, number));
    }

    private int findContactItem(String searchContactItem) {
        return contactsList.indexOf(searchContactItem);
    }

    public void printList() {
        System.out.println("You have " + contactsList.size() + " contacts in the list");
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println((i + 1) + " ." + contactsList.get(i));
        }
    }

    public void updateContactItems(String contactName, String newContactName, String newContactNumber){

        int position = findContactItem(contactName);
        if (position >= 0) {
            updateContactItems(position, newContactName, newContactNumber);
        }
        else {
            System.out.println("Contact not found with the name " + contactName);
        }
    }
    private void updateContactItems(int position, String newContactName, String newContactNumber) {
            contactsList.set(position, new Contact(newContactName, newContactNumber));
    }

    public void deleteContact(String name) {
        int position = findContactItem(name);
        if (position >= 0) {
            deleteContact(position);
        }
    }

    private void deleteContact(int position) {
        contactsList.remove(position);
    }

    public boolean onFile(String name) {
        int position = findContactItem(name);
        return position >= 0;
    }
}
