public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean playingOrNot = false;
        if((summer == true) && (temperature >= 25) && (temperature <= 45)){
            playingOrNot = true;
        }
        else if((summer == false) && (temperature >= 25) && (temperature <= 35)){
            playingOrNot = true;
        }
        return playingOrNot;
    }
}
