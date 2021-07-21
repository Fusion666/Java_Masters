public class MyDoublyLinkedList {
    private MyNode head;
    private int size;

    public MyDoublyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFront(int data) {
        if (head == null) {
            head = new MyNode(null, data, null);
        } else {
            MyNode newNode = new MyNode(null, data, head);
            head.previous = newNode;
            head = newNode;
        }
    }
    public boolean isEmpty() {
        return head == null; // if head is null then this method returns true
    }
}
