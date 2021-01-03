public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //1 unit of bigCount = 5;
        //1 unit of smallCount = 1;
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        else if((bigCount == 0)) {
            return smallCount >= goal;
        }
        else if(((bigCount * 5) + (smallCount)) >= goal) {
            for(int i = 1; i <= bigCount; i++) {
                if(goal % 5 == 0) {
                    return true;
                }
                if(goal - (i * 5) <= 0) {
                    break;
                }
                if(goal - (i * 5) <= smallCount) {
                    return true;
                }
            }
        }
        return false;
    }
}
