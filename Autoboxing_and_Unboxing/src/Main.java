import java.util.ArrayList;

class intClass {
    private int myValue;

    public intClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

//        ArrayList<int> intArraylist = new ArrayList<int>();

        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(10)); // this is method to add an int primitive number to an ArrayList of int - by firstly creating a intClass that can only hold ints!!

        Integer integer = 54;
        Double doubleValue = new Double(2.23);
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//        for (int i = 0; i <= 10; i++) {
//            integerArrayList.add(Integer.valueOf(i));
//        }
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
//        }
        Integer intValue = 56; // Integer intValue = Integer.valueOf(56);
        Double dValue = 45.66;
        int myInt = intValue; // int myInt = myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double i = 0.0; i <= 1; i += 0.1) {
            myDoubleValues.add(Double.valueOf(i));// equal to myDoubleValues.add((double) i);
        }
        for (int i = 0; i <myDoubleValues.size(); i ++) {
            double value = myDoubleValues.get(i).doubleValue(); // equal to myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
