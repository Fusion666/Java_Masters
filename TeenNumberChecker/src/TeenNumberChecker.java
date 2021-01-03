public class TeenNumberChecker {
    public static boolean hasTeen(int numTeen1, int numTeen2, int numTeen3) {
        return(((numTeen1 >= 13) && (numTeen1 <= 19)) || ((numTeen2 >= 13) && (numTeen2 <= 19))
                || ((numTeen3 >= 13) && (numTeen3 <= 19)));
    }

    public static boolean isTeen(int numIsTeen) {
        return(((numIsTeen >= 13) && (numIsTeen <= 19)));
    }
}
