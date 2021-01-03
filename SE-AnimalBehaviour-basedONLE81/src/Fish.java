public class Fish extends Animal{
    private int fins;
    private int gills;
    private int eyes;
    private String color;

    public Fish(String name, int weight, int body, int brain, int size, int fins, int gills, int eyes, String color) {
        super(name,weight, 1,1,size);
        this.fins = fins;
        this.gills = gills;
        this.eyes = eyes;
        this.color = color;
    }
    public int getFins(){
        return fins;
    }

    public int getGills() {
        return gills;
    }
    public int getEyes() {
        return eyes;
    }
    public String getColor() {
        return color;
    }

    private void swim() {
        System.out.println("Fish.swim called");
    }
    private void rest() {
        System.out.println("Fish.rest called");
    }
    private void moveMuscles() {
        System.out.println("Fish moveMuscles called");
    }

    @Override
    public void move(int speed) {
        swim();
        moveMuscles();
        super.move(speed);
    }
}
