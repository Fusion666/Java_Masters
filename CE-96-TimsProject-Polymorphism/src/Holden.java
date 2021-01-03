public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> engine -> Starting Engine! ";
    }

    @Override
    public String accelerate() {
        return "Holden -> Starting to accelerate!";
    }

    @Override
    public String brake() {
        return "Holden brake -> Brake being pressed!";
    }
}
