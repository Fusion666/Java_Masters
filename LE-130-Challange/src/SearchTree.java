public class SearchTree implements NodeList {

    private AbstractNode root = null;

    public SearchTree(AbstractNode root) {
        this.root = root;
    }

    @Override
    public AbstractNode getRoot() {
        return this.root;
    }

    @Override
    public boolean addNode(AbstractNode nodeItem) {
        if (this.root == null) {
            // the tree was empty, so our item becomes the head of the tree
            this.root = nodeItem;
            return true;
        }

        // otherwise, start comparing from the head of the tree
        AbstractNode currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(nodeItem));
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there's no node to the right, so add at this point
                    currentItem.setNext(nodeItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, move left if possible
                if (currentItem.prev() != null) {
                    currentItem = currentItem.prev();
                } else {
                    // there's no node to the left, so add at this point
                    currentItem.setPrev(nodeItem);
                    return true;
                }
            } else {
                // equal, so don't add
                System.out.println(nodeItem.getValue() + " is already present");
                return false;
            }
        }
        // we can't actually get here, but Java complains if there's no return
        return false;
    }

    @Override
    public boolean removeNode(AbstractNode nodeItem) {
        return false;
    }


    @Override
    public void traverse(AbstractNode root) {
        // recursive method
        if (root != null) {
            traverse(root.prev());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
