public class Node {
    private int data;
    public Node prev;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public void display() {
        System.out.println("Displaying: " + data);
    }
}
