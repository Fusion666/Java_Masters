public class Animal {
    private String name;
    private int weight;
    private int body;
    private int brain;
    private int size;

    public Animal(String name, int weight, int body, int brain, int size) {
        this.name = name;
        this.weight = weight;
        this.body = body;
        this.brain = brain;
        this.size = size;
    }

    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed);

    }

    public void eat() {
        System.out.println("Animal.eat called.");
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

}
