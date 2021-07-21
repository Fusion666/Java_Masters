public class TheSinglyLinkedList {

    Node head;

    public TheSinglyLinkedList(Node head) {
        this.head = head;
    }

    void displayList() {
        if (head == null) {
            System.out.println("There is nothing in the list.");
        } else {
            Node myCurrentNode = head;
            while (myCurrentNode != null) {
                myCurrentNode.display();
                myCurrentNode = myCurrentNode.next;
            }
        }
    }
    void addNodeToEnd(String soldItem, String nameOfBuyer, String nameFamilyOfBuyer, double price) {
        Node n = new Node(soldItem, nameOfBuyer, nameFamilyOfBuyer, price);

        if (head == null) {
            head = n;
        } else {
            Node curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.next = n;
        }
    }

    void addToStart(String soldItem, String nameOfBuyer, String nameFamilyOfBuyer, double price) {
        Node n = new Node(soldItem, nameOfBuyer, nameFamilyOfBuyer, price);
        n.next = head;
        head = n;
    }

    void addAfterHead(String soldItem, String nameOfBuyer, String nameFamilyOfBuyer, double price) {
        Node n = new Node(soldItem, nameOfBuyer, nameFamilyOfBuyer, price);
        n.next = head.next;
        head.next = n;
    }

    void addAfter(String insertAfterNameOfBuyer, String soldItem, String nameOfBuyer,
                  String nameFamilyOfBuyer, double price) {
        Node curr = head;
        while (curr != null) {
            if (curr.getNameOfBuyer() == insertAfterNameOfBuyer) {
                Node n = new Node(soldItem, nameOfBuyer, nameFamilyOfBuyer, price);
                n.next = curr.next;
                curr.next = n;
                break;
            }
            curr = curr.next;
        }
    }

    Node deleteLast() {
        Node curr = head;
        if (curr == null || curr.next == null) {
            head = null;
            return curr;
        }
        Node nextNode = curr.next;
        while (curr.next != null) {
            if (nextNode.next == null) {
                curr.next = null;
            }
            curr = nextNode;
            nextNode = nextNode.next;
        }
        return curr;
    }

    Node deleteAtStart() {
        if (head != null) {
            Node curr = head;
            head = head.next;
            return curr;
        }
        return null;
    }

    Node deleteAfter(String afterWhichName) {
        Node curr = head;
        Node toDelete = null;
        Node nextNode = curr.next;
        while (curr != null) {
            if (curr.nameOfBuyer == afterWhichName && curr.next != null) {
                toDelete = curr.next;
                curr.next = toDelete.next;
                break;
            }
            curr = curr.next;
        }
        return toDelete;
    }

    Node deleteNode(String deleteByFirstName) {
        Node curr = head;
        Node toDelete = null;
                if (curr == null) {
                    return null;
                } else if (curr.next == null && curr.getNameOfBuyer().equals(deleteByFirstName)) {
                    System.out.println("match!");
                    toDelete = curr;
                    curr = null;
                    return toDelete;
                } else if (curr.getNameOfBuyer().equals(deleteByFirstName)) {
                   toDelete = curr;
                   head = head.next;
                } else while (curr != null) {
                    toDelete = curr.next;
                    if (toDelete.getNameOfBuyer().equals(deleteByFirstName)) {
                        curr.next = toDelete.next;
                        return toDelete;
                    } else {
                        curr = curr.next;
                        toDelete = toDelete.next;
                    }
                }
            return toDelete;
            }

}
