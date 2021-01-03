public class Dog extends Animal{
    private int ears;
    private int legs;
    private String coat;
    private int tail;
    private int teeth;

    public Dog(String name, int weight, int body, int brain, int size, int legs, int ears, String coat, int tail, int teeth) {
        super(name, weight, 1, 1,size);
        this.legs = legs;
        this.ears = ears;
        this.coat = coat;
        this.tail = tail;
        this.teeth = teeth;
    }
    public int getEars() {
        return ears;
    }
    public int legs() {
        return legs;
    }
    public String getCoat() {
        return coat;
    }
    public int getTail() {
        return tail;
    }
    public int getTeeth() {
        return teeth;
    }
    private void chew() {
        System.out.println("Dog.chew called.");
    }
    private void walk() {
        System.out.println("Dog.walk called.");
    }
    private void run() {
        System.out.println("Dog.run called.");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        walk();
        run();
        super.move(5);
    }
}
