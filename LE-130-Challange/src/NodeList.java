public interface NodeList {
    AbstractNode getRoot(); // this is actually the head of the list

    boolean addNode(AbstractNode nodeItem); // here we add an item - returns true of false

    boolean removeNode(AbstractNode nodeItem); // same like above but here we remove

    void traverse(AbstractNode root); //this is the head where we start
}
