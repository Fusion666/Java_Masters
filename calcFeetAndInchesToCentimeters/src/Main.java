public class Main {
    public static void main(String[] args) {
    //calcFeetAndInchesToCentimeters(-10,0);
    calcFeetAndInchesToCentimeters(100);
    }
    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if(feet <= 0 || ((inches > 12) || (inches < 0))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        else {
            double centimeters = ((feet * 30.48) + (inches * 2.54));
            System.out.println("Result in centimeters is: " + centimeters);
            return centimeters;
        }

    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if(inches <= 0) {
            return -1;
        }
        else {
            double feet = (int) inches / 12;
            double remainderInches = (int) inches % 12; //first a variable feet is created that calculates feet from the inches we have
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainderInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainderInches); // here we pass the variable feet and the remain
        }
    }
}
