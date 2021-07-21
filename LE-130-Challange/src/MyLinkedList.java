public class MyLinkedList implements NodeList{
    private AbstractNode root = null;

    public MyLinkedList(AbstractNode root) {
        this.root = root;
    }

    @Override
    public AbstractNode getRoot() {
        return this.root;
    }

    @Override
    public boolean addNode(AbstractNode nodeNewItem) {
        if (this.root == null) {
            //there was nothing in the list so we the new item should become the head(root) of the list
            root = nodeNewItem;
            return true;
        } else {
            // there was a previous added Node, so now we have to add another node to the list
            AbstractNode curr = root;
            while (curr != null) {
                int comparison = (curr.compareTo(nodeNewItem));
                if (comparison < 0) {
                    //this means that the new item is with a greater value - we have to move right(next)
                    if (curr.next() != null) {
                        curr = curr.next();
                    } else {
                        //there is no next so insert at the end of the list
                        curr.setNext(nodeNewItem).setPrev(curr);
//                        nodeNewItem.setPrev(curr);
                        return true;
                    }
                } else if (comparison > 0) {
                    // this means that the new item is less so we have to insert before
                    if (curr.prev() != null) {
                        curr.prev().setNext(nodeNewItem); // we can only add a node that is leser than the current one
                        nodeNewItem.setPrev(curr.prev());
                        nodeNewItem.setNext(curr);
                        curr.setPrev(nodeNewItem);
                    } else {
                        // we have reached the root(head) of the doubly linked list
                        nodeNewItem.setNext(root);
                        root.setPrev(nodeNewItem);
                        root = nodeNewItem;
                    }
                    return true;
                } else {
                    //equal
                    System.out.println(nodeNewItem.getValue() + " is already in the list. No duplicates allowed.");
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeNode(AbstractNode nodeItem) {
        if (nodeItem != null) {
            System.out.println("Deleted item: " + nodeItem.getValue());
        }

        AbstractNode curr = this.root;
        while (curr != null) {
            int comparison = curr.compareTo(nodeItem);
            if (comparison == 0) {
                if (curr == this.root) {
                    this.root = curr.next();
                } else {
                    curr.prev().setNext(curr.next());
                    if (curr.next()  !=null) {
                        curr.next().setPrev(curr.prev());
                    }

                }
                return true;
            } else if (comparison < 0) {
                curr = curr.next();
            } else {                //meaning comparison is > 0 -> we are at an item greater than the one to be deleted
                                    // meaning the item is not in our list
                return false;
            }
        }
        //here we have reached the end of the list without finding our desired for deletion item
        return false;
    }

    @Override
    public void traverse(AbstractNode root) {
        if (root == null) {
            System.out.println("There are no nodes in the list");
        } else {
            while (root != null) {
                System.out.println("value: " + root.getValue());
                root = root.next();
            }
        }
    }
}
