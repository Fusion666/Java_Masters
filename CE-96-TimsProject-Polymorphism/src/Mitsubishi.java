public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> engine -> Starting Engine! ";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> Starting to accelerate!";
    }

    @Override
    public String brake() {
        return "Mitsubishi brake -> Brake being pressed!";
    }

}
