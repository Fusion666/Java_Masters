public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "Cooler Master", dimensions);


        Monitor monitor = new Monitor("b240", "Asus", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");

        PC thePC = new PC(theCase, monitor, theMotherboard);

        thePC.powerUP();
        //monitor.drawPixelAt(1200, 800, "blue");
    }
}
