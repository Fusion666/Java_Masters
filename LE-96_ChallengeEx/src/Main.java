class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name; // safasdfasfdasdfasfdaf
        
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public int accelerate(int rateOfAcceleration, int timeOfAcceleration, int maxSpeed) {
        for(int i = 1; i < timeOfAcceleration; i++) {
            if(rateOfAcceleration < maxSpeed) {
                rateOfAcceleration += rateOfAcceleration;
            }
            else {
                System.out.println("Maximum speed reached at: " + i + " second");
                return maxSpeed;
            }
        }
        return rateOfAcceleration;
    }

    public void brake() {
        System.out.println("Brake pulled.");
    }
}


class Dodge extends Car {
    public Dodge() {
        super("Viper", 8);
    }

    // TODO: 3.1.2021 г. dygggku

    @Override
    public void brake() {
        System.out.println("Dodge brake pulled.");
    }

    public void something() {
        System.out.println();
        System.out.println();
// TODO: 3.1.2021 г. aaaaaaa

    }
}

class Porsche extends Car {
    public Porsche() {
        super("Panamera", 8);
    }

    @Override
    public void brake() {
        System.out.println("Porsche brake pulled.");
    }
}

class Tesla extends Car {
    public Tesla() {
        super("X", 0);
    }

    @Override
    public void brake() {
        System.out.println("Tesla brake pulled.");
    }
}



public class Main {
    public static void main(String[] args) {

    }
}
