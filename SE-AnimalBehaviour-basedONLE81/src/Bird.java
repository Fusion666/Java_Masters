public class Bird extends Animal{
    private int wings;
    private int legs;
    private int eyes;
    private int beak;
    private int feathers;
    private String color;
    public Bird(String name,int weight, int body, int brain, int size, int wings, int legs, int eyes, int beak,
                int feathers, String color) {
        super(name,weight,1,1,size);
        this.wings = wings;
        this.legs = legs;
        this.eyes = eyes;
        this.beak = beak;
        this.feathers = feathers;
        this.color = color;
    }
    public int getWings() {
        return wings;
    }

    public int getLegs() {
        return legs;
    }
    public int getEyes() {
        return eyes;
    }
    public int getBeak() {
        return beak;
    }
    public int getFeathers() {
        return feathers;
    }
    public String getColor() {
    return color;
    }

    private void fly() {
        System.out.println("Bird.fly called");
    }
    private void walk(int speed){
        System.out.println("Bird.walk called. Bird is walking at: " + speed);
    }
    private void run(int speed) {
        System.out.println("Bird.run called. Bird is running at: " + speed);
    }

    @Override
    public void move(int speed) {
        walk(speed);
        run(speed);
        fly();
        super.move(speed);
    }
}
