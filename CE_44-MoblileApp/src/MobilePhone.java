    import java.util.ArrayList;

    public class MobilePhone {
        private String myNumber;
        private ArrayList<Contact> myContacts;

        public MobilePhone(String myNumber) {
            this.myNumber = myNumber;
            this.myContacts = new ArrayList<>();
        }

        public boolean addNewContact(Contact contact) {
            if (findContact(contact.getName()) >= 0) {
                return false;
            }
            else {
                myContacts.add(contact);
                return true;
            }
        }

        public boolean updateContact(Contact oldContact, Contact newContact) {
            int foundPosition = findContact(oldContact);
            if (foundPosition < 0) {
                return false;
            } else {
                this.myContacts.set(foundPosition, newContact);
                return true;
            }
        }

        public boolean removeContact(Contact contact) {
            int foundPosition = findContact(contact);
            if (foundPosition < 0) {
                return false;
            } else {
                this.myContacts.remove(foundPosition);
                return true;
            }
        }

        private int findContact(String contactName) {
            for (int i = 0; i < this.myContacts.size(); i++) {
                Contact contact = this.myContacts.get(i);
                if (contact.getName().equals(contactName)) {
                    return i;
                }
            }
            return -1;
        }

        private int findContact(Contact contact) {
            return this.myContacts.indexOf(contact);
        }

        public Contact queryContact(String name) {
            int foundContact = findContact(name);
            if (foundContact >= 0) {
                return this.myContacts.get(foundContact);
            }
            return null;
        }

        public void printContacts() {
            System.out.println("Contact List:");
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber()) ;
            }
        }
    }
