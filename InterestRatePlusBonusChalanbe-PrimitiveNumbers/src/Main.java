public class Main {
    public static void main(String[] args) {
//        System.out.println("10 000 at 2% = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10 000 at 3% = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10 000 at 4% = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10 000 at 5% = " + calculateInterest(10000.0, 5.0));
//        for (int i = 8; i > 1; i--){
//            calculateInterest(10_000, 2);
//            System.out.println("10 000 at " + i +"% = "+ String.format("%.2f",calculateInterest(10000.0, (double) i)));
//        }

        printFirstThreePrimeNumbersFromARange(1, 30);
        System.out.println("Result = " + isPrime(8));
    }

    public static double calculateInterest(double amount, double interestRate){
        return ((amount * interestRate) /100);

    }

    public static boolean isPrime(int n){
        boolean result = true;
        if(n == 1){
            result = false;
        }
        for(int i = 2; i <= n/2; i++ ){
            if(n % i == 0){
                result = false;
                break;
            }
        }
        //System.out.println(n);
        return result;
    }

    public static void printFirstThreePrimeNumbersFromARange (int rangeStart, int rangeEnd) {
        int primeNumber = 0;
        for(int j = rangeStart; j <= rangeEnd; j++){
//            if(isPrime(j) && primeNumber < 3) {
//                primeNumber++;
//                System.out.println(j);
//            }

            if(isPrime(j)){ //this piece of code is an alternative version to the code above 
                primeNumber++;
                System.out.println("Number " + j + " is a prime number");
                if(primeNumber == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }

        }
    }
}
