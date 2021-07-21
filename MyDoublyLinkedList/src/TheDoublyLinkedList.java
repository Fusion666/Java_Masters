public class TheDoublyLinkedList {
    private Node head;

    public void displayList() {
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


    public TheDoublyLinkedList(Node head) {
        this.head = head;
    }

//    public void addNewNodeAfter(int data) {
//        Node after = new Node(data);
//
//        head.next = after;
//        after.prev = head;
//    }
//
//    public void addNewNodeBefore(int data) {
//        Node before = new Node(data);
//
//        head.prev = before;
//        before.next = head;
//        head = before;
//    }

    public void addNewNodeToEnd(int data) {
        Node toBeAddedAtEnd = new Node(data);

        if (head == null) {
            head = toBeAddedAtEnd;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = toBeAddedAtEnd;
            toBeAddedAtEnd.prev = curr;
        }
    }

    public void addNewNodeToStart(int data) {
        Node toBeAddedAtStart = new Node(data);
        if (head != null) {
            head.prev = toBeAddedAtStart;
            toBeAddedAtStart.next = head;
            head = toBeAddedAtStart;
        }
        head = toBeAddedAtStart;
    }

    public void addNodeAfter(int dataAfter, int data) {
        Node curr = head;
        if (head == null) {
            System.out.println("There is nothing to add after!");
        } else {
            while (curr.getData() != dataAfter || ((curr.getData() != dataAfter) && curr.next == null)) {
                curr = curr.next;
            }
            if (curr.getData() == dataAfter) {
                Node newNode = new Node(data);
                newNode.prev = curr;
                newNode.next = curr.next;
                if (curr.next != null) {
                   curr.next.prev = newNode;
                }
                curr.next = newNode;
            }
        }
    }

    void addAfterRecursive(Node curr, int insertAfter, int data) {
        if (curr == null) {
            return;
        }
        if (curr.getData() == insertAfter) {
            System.out.println("Kole did you receive??!");
            Node newNode = new Node(data);
            if (curr.next != null) {
                System.out.println("working");
                curr.next.prev = newNode;
                newNode.next = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;
        } else {
            addAfterRecursive(curr.next,insertAfter, data);
        }
    }

    public Node deleteAtEnd() {
        Node toDelete = head;
        if (head == null || head.next == null) {
            head = null;
            return toDelete;
        }
        while (toDelete.next != null) {
            toDelete = toDelete.next;
        }
        return toDelete.prev.next = null;
    }

    public Node deleteNodeAtStart() {
        Node toDelete = head;
        if (head == null || head.next == null) {
            head = null;
            return toDelete;
        }
        head = head.next;
        head.prev = null;
        return toDelete;
    }

    public Node deleteNodeAfter(int dataAfter) {
        Node curr = head;
        Node toDeleteAfter = null;
        if (curr == null) {
            return null;
        }
        while (curr.getData() != dataAfter) {
            if (curr.next != null) {
                curr = curr.next;
                toDeleteAfter = curr;
            } else {
                System.out.println("nothing to delete after");
                return null;
            }
        }
        toDeleteAfter = curr.next;
        if (toDeleteAfter.next != null) {
            toDeleteAfter.next.prev = toDeleteAfter.prev;
        }
        toDeleteAfter.prev.next = toDeleteAfter.next;
        return toDeleteAfter;
    }
}
