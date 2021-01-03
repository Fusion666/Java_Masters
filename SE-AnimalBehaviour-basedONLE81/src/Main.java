

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog", 10, 1,1, 10);
        dog.eat();
        dog.move(5);
        Animal goldenRetriever = new Dog("Logan",10, 1,1,20,4,2, "fur",1,20);
        Animal fish = new Fish("some kind", 7,1,1,30,4,1,2,"silver");
        fish.move(2);

        Animal bird = new Bird("Parrot", 2,1,1,20,2,2,2,1,1500,
                                "yellow");
        bird.move(20);
    }
}
