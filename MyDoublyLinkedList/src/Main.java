public class Main {
    public static void main(String[] args) {
        TheDoublyLinkedList newDoublyList = new TheDoublyLinkedList(new Node(4));
        newDoublyList.addNewNodeToStart(3);
        newDoublyList.addNewNodeToStart(6);
        newDoublyList.addNewNodeToStart(7);
        newDoublyList.addNewNodeToStart(11);

        newDoublyList.addNodeAfter(7,22);
//        newDoublyList.addAfterRecursive(new Node(12),7, 22);

//        newDoublyList.displayList();
//        newDoublyList.deleteAtEnd();
//        newDoublyList.displayList();
//        newDoublyList.deleteNodeAtStart();
//        newDoublyList.displayList();
        newDoublyList.deleteNodeAfter(6);
        newDoublyList.displayList();
    }
}
