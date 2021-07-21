public class TheLinkedList {
    FirstNode firstLink;

    public boolean isEmpty() {
        return (firstLink == null);
    }

    public void insertLink(int price, String item) {
        FirstNode theLatestNode = new FirstNode(item, price);
        theLatestNode.next = firstLink;
        firstLink = theLatestNode;

    }
//
//    public Link removeFirst() {
//        Link linkReference = firstLink;
//        if (is) {
//        }
//    }

    public void display() {
        System.out.println("HI there ");
        FirstNode myNode = firstLink;
        while (myNode != null) {
            myNode.display();
            System.out.println("Hello??!");
            myNode = myNode.next;
        }
    }
}
