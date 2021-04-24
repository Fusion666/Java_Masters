import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>(); //normally this constructor should created here when we are dealing with such arrays
    }

    //    (1) this method will check if we have a contact on file(calling findContact method (2) under) and if not add

/*ADD NEW CONTACT BOOLEAN CHECK METHOD */
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        else {
            myContacts.add(contact);
            return true;
        }
    }
/*FIND CONTACT FUNCTION*/
    public boolean findContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with: " + newContact.getName());
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact); // index of returns number 0 or > if contact exits and if NOT <0
    }


    /* UPDATE CONTACT METHOD*/
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " contact was not found.");
            return false;
        }
//        else if (findContact(newContact.getName()) != - 1) {
//            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
//            return false;
//        }

        else {
            this.myContacts.set(foundPosition, newContact); //as a reminder here we replace the old contact with a new one
            // we use the set method that requires the index that we just found and then the new object in our case
            System.out.println(oldContact.getName() + "was replaced with " + newContact.getName());
            return true;
        }
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " -> " + //get(i) is the i-nth object in our ArrayList that is from the class Contact
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

    /*REMOVE CONTACT*/
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }


    //(2) this method will return a positive number if it finds an existing contact, else the returned number is negative
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i); // in this for Loop we create a list of contacts where we store the
            //checked ones and once we reach the same name or the end of the list we exit the loop with
            // the index of the element in the current list
            if (contact.getName().equals(contactName)) { //unknown inbuilt functions -> should check them
                return i;
            }
        }
        return -1;
    }

    /*This method here will return the contact name of an existing contact in our ArrayList*/
   public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

}
