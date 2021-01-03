public class Main {
    public static void main(String[] args) {

        int firstFiveNumbers = 0;
        int sumOfFirstFiveNumbers = 0;

        for (int i = 1; i <= 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                firstFiveNumbers++;
                sumOfFirstFiveNumbers = sumOfFirstFiveNumbers + i;
            }
            if (firstFiveNumbers == 5){
                break;
            }

        }
        System.out.println(sumOfFirstFiveNumbers);
    }
}