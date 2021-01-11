public class Car {

        private boolean engine;
        private int cylinders;
        private String name;
        private int wheels;

        public Car(int cylinders, String name) {
            this.engine = true;
            this.cylinders = cylinders;
            this.name = name;
            this.wheels = 4;
        }

        public String startEngine() {
            return "Car -> engine -> Starting Engine!";
        }

        public String accelerate() {
            return "Car -> accelerate -> Starting to accelerate!";
        }

        public String brake() {
            return "Car -> brake -> Brake being pressed!";
        }

    public String getName() {
            return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
