public class TheCircularLinkedList {
    Node last;

    public TheCircularLinkedList(Node last) {
        this.last = last;
        if (this.last != null) {
            this.last.next = last;
        }
    }

    public void addNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            newNode.next = newNode;
        } else {
            last.next = newNode;
            newNode.next = last;
        }
        last = newNode;
    }

    public void addNodeAtStart(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void addNodeAfter(int insertAfter, int data) {
        if (last != null) {
            Node curr = last;
            do {
                if (curr.getData() == insertAfter) {
                    Node newNode = new Node(data);
                    newNode.next = curr.next;
                    curr.next = newNode;
                    break;
                }
                curr = curr.next;
            } while (curr != last);
        }
    }

    public Node deleteLast() {
        Node toDelete = last;
        if (last == null || last.next == last) {
            last = null;
            return toDelete;
        }
        Node prev = last.next;
        while (prev.next != last) {
            prev = prev.next;
        }
        prev.next = last.next;
        last = prev;
        return toDelete;
    }

    public Node deleteAtStart() {
        Node toDelete = last;
        if (last == null || last.next == last) {
            last = null;
            return toDelete;
        }
        toDelete = last.next;
        last.next = toDelete.next;
        return toDelete;
    }

    public Node deleteAfter(int deleteAfter) {
        if (last == null) {
            return null;
        }
        Node toDelete = null;
        Node curr = last;

        do {
            if (curr.getData() == deleteAfter) {
                toDelete = curr.next;
                if (curr.next == curr) {
                    last = null;
                } else {
                    curr.next = toDelete.next;
                    if (toDelete == last) {
                        last = curr;
                    }
                }
                break;
            }
            curr = curr.next;
        } while (curr != last);
        return toDelete;
    }
}
