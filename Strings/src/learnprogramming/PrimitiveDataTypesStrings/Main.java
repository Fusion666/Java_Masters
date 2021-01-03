package learnprogramming.PrimitiveDataTypesStrings;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //double
        //float
        //Char
        //boolean
        String myString = "This is a string";
        System.out.println("My string is equal to: " + myString );
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to: " + myString );
        myString = myString + "\u00A9 2020";
        System.out.println("My string is equal to: " + myString );

        String myNumberString = "250.55";
        myNumberString = myNumberString + "49.95";
        System.out.println(myNumberString);

        String myLastString = "10";
        int myInt = 50;
        myLastString = myLastString + myInt;
        System.out.println("LastString is equal to " + myLastString);
        double doubleNumber = 120.47d;
        myLastString = myLastString + doubleNumber;
        System.out.println("LastString is equal to " + myLastString);
    }
}
