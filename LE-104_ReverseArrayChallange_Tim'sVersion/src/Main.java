import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4 ,5};
        //System.out.println("Array = " + Arrays.toString(array));

        //ReverseArray reverseArray = new ReverseArray();
        //reverseArray.reverse(array);
        //System.out.println("Reversed array = " + Arrays.toString(array));
        //System.out.println("Reversed array = " + Arrays.toString(array));
        ReverseArray.reverse(array);
    }

//    private static void reversed(int[] array) {
//        int maxIndex = array.length - 1;
//        int halfLength = array.length / 2;
//        for (int i = 0; i < halfLength; i++) {
//            int temp = array[i];
//            array[i] = array[maxIndex - i];
//            array[maxIndex - i] = temp;
//        }
//    }

//    private static void reverse(int[] array) {
//        int lastIndex = array.length -1;
//        int halfLengthOfArray = array.length / 2;
//        for (int i = 0; i < halfLengthOfArray; i++) {
//            int temp = array[i];
//            array[i] = array[lastIndex - i];
//            array[lastIndex] = temp;
//        }
//    }
    //import java.util.Arrays;

    public static class ReverseArray {
        public static void reverse(int[] array) {
            System.out.println("Array = " + Arrays.toString(array));
            int lastIndex = array.length - 1;
            int halfLengthOfArray = array.length / 2;
            for (int i = 0; i < halfLengthOfArray; i++) {
                int temp = array[i];
                array[i] = array[lastIndex - i];
                array[lastIndex - i] = temp;
            }
            System.out.println("Reversed array = " + Arrays.toString(array));
        }
    }
}
