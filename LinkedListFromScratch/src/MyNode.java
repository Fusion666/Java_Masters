public class MyNode {
    private int data;
    public MyNode previous;
    public MyNode next;

    public MyNode(int data) {
        previous = null;
        this.data = data;
        next = null;
    }

    public MyNode(MyNode previous, int data, MyNode next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }
}
