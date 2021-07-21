public class Pinguin extends Bird {
    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not very good at that. Can I swim instead?");
    }
}
