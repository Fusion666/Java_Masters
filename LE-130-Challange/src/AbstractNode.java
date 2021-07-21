public abstract class AbstractNode {
    protected AbstractNode right = null;
    protected AbstractNode left = null;

    protected Object value;

    public AbstractNode(Object value) {
        this.value = value;
    }

    abstract AbstractNode next();
    abstract AbstractNode setNext(AbstractNode myNodeItem);

    abstract AbstractNode prev();
    abstract AbstractNode setPrev(AbstractNode myNodeItem);

    abstract int compareTo(AbstractNode myNodeItem);

    //this peace of code creates an Object that can store whatever type of data is needed
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}