public class Main {
    public static void main(String[] args) {
        MyLinkedList theList = new MyLinkedList(null);
        SearchTree tree = new SearchTree(null);
//        theList.traverse(theList.getRoot());

//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String stringData = "1 2 3 0 4 6 3 2 9 8 7";

        String[] data = stringData.split(" "); // here the interval is the delimiter that separates each string
        // here we use the enhanced for loop also known as for each - meaning that instead of having data.size
        // we have an instance being created ('data') each time we increment
        for (String s: data) {
            theList.addNode(new TheNode(s));
            // create new item with value set to the string s
        }
        theList.traverse(theList.getRoot());
//        theList.removeNode(new TheNode("5"));
//        theList.traverse(theList.getRoot());

//        for (String s: data) {
//            tree.addNode(new TheNode(s));
//            // create new item with value set to the string s
//        }
//        tree.traverse(tree.getRoot());
    }
}
