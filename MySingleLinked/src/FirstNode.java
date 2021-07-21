public class FirstNode {
    private String item;
    private int price;
    FirstNode next;

    public FirstNode(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Is this thing even working?");
        System.out.println("Item: " + item);
        System.out.println("Price: " + price+ "\n");
    }
}
