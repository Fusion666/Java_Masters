public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("RingNeck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Pinguin pinguin = new Pinguin("Emperor");
        pinguin.eat();
        pinguin.breathe();
        pinguin.fly();
    }
}

