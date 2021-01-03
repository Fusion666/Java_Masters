public class SumOddRange {
    public static boolean isOdd(int number){
        if(number > 0){
            return number % 2 == 1;
        }
        else return false;
    }

    public static int sumOdd(int start, int end){
        int sumOddNumbers = 0;
        if(((start > 0) && (end > 0)) && (end >= start)){
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sumOddNumbers = sumOddNumbers + i;
                }
            }
            return sumOddNumbers;
        }
        else return -1;
    }
}