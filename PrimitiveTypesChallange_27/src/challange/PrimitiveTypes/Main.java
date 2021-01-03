package challange.PrimitiveTypes;

public class Main {

    public static void main(String[] args) {
        byte MyByteValue = 125;

        short MyShortValue = 22_478;

        int MyIntValue = 78_988;

        long MyLongValue = 50_000L + (10L * (MyByteValue + MyShortValue + MyIntValue));
        System.out.println(MyLongValue);
    }
}
