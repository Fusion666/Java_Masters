public class Main {
    public static void main(String[] args) {
        TheSinglyLinkedList newListOfItems = new TheSinglyLinkedList(new Node("Harry Potter and the Philosopher's Stone",
                "George", "Bush", 8));
        newListOfItems.addNodeToEnd("Harry Potter and The Prisoner of Azkaban", "Donald",
                "Trump", 8.99);
        newListOfItems.addToStart("Harry Potter and the Chambers of Secrets", "Barak",
                "Obama", 8.99);
        newListOfItems.addAfterHead("Harry Potter and the Order Of The Phoenix", "Hillary",
                "Clinton", 10.99);
        newListOfItems.addAfter("Hillary", "Harry Potter and The Half-Blood Prince",
                "Bill", "Clinton", 12.99);
        newListOfItems.deleteLast();
        newListOfItems.deleteAfter("Barak");
        newListOfItems.deleteNode("Barak");
        newListOfItems.deleteAtStart();
        newListOfItems.displayList();
    }
}
