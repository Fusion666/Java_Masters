public class TheNode extends AbstractNode {
    public TheNode(Object value) {
        super(value);
    }

    @Override
    AbstractNode next() {
        return this.right;
    }

    @Override
    AbstractNode setNext(AbstractNode myNodeItem) {
        this.right = myNodeItem;
        return this.right;
    }

    @Override
    AbstractNode prev() {
        return this.left;
    }

    @Override
    AbstractNode setPrev(AbstractNode myNodeItem) {
        this.left = myNodeItem;
        return myNodeItem;
    }

    @Override
    int compareTo(AbstractNode myNodeItem) {
        if (myNodeItem != null) {
            return ((String) super.getValue()).compareTo((String) myNodeItem.getValue());
        } else {
            return -1;
        }
    }


}
