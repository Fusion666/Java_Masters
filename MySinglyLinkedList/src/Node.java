public class Node {
    private String SoldItem;
    public String nameOfBuyer;
    private String nameFamilyOfBuyer;
    private double price;
    public Node next;

    public Node(String soldItem, String nameOfBuyer, String nameFamilyOfBuyer, double price) {
        next = null;
        SoldItem = soldItem;
        this.nameOfBuyer = nameOfBuyer;
        this.nameFamilyOfBuyer = nameFamilyOfBuyer;
        this.price = price;
    }

    public String getSoldItem() {
        return SoldItem;
    }

    public String getNameOfBuyer() {
        return nameOfBuyer;
    }

    public String getNameFamilyOfBuyer() {
        return nameFamilyOfBuyer;
    }

    public double getPrice() {
        return price;
    }

    public Node getNext() {
        return this.next;
    }

    public void display() {
        System.out.println("Item sold: " + this.SoldItem);
        System.out.println("Name of buyer: " + this.nameOfBuyer);
        System.out.println("Family name of buyer: " + this.nameFamilyOfBuyer);
        System.out.println("Price paid: " + this.price + "\n");
    }
}
