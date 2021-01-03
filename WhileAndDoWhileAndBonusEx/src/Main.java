public class Main {
    public static void main(String[] args) {
//        int count = 0;
//        while (count !=5) {
//            System.out.println("Count " + count);
//            count++;
//        }
//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count " + count);
//            count++;
//        }

//        do {
//            System.out.println("Count " + count);
//            count++;
//        } while (count !=5);
        int num = 4;
        int finishNum = 50;
        int countTotalOf5Even = 0;
        int sumOfFirst5EvenNumbers = 0;

        while (num < finishNum) {
            num++;
            if(!isEven(num)){
                continue;
            }
            countTotalOf5Even++;
            if(countTotalOf5Even < 6) {
                sumOfFirst5EvenNumbers = sumOfFirst5EvenNumbers + num;
                System.out.println("Even number: " + num);
            }
        }
        System.out.println("Sum of first five EVEN numbers: " + sumOfFirst5EvenNumbers);

    }
    public static boolean isEven(int num){
        if (num % 2 == 1){
            return false;
        }
        return true;
    }
}
