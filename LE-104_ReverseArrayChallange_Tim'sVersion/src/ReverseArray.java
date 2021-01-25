import java.util.Arrays;

public class ReverseArray {
    public void reverse(int[] array) {
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
