package learnprogramming.Keywords;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5_000 && score > 1_000) {
//            System.out.println("Your score was less than 5000");
//        } else if (score < 1_000) {
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got here.");
//        }
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

//        boolean newGameOver = true;
//        int newScore = 1_000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (gameOver) {
//            int finalScore = newScore + (newBonus * newLevelCompleted);
//            System.out.println("Your final score was " + finalScore + "!");
//        }
         score = 10_000;
         levelCompleted = 8;
         bonus = 200;

        if (gameOver) {
            int finalScore = score + (bonus * levelCompleted);
            System.out.println("Your final score was " + finalScore + "!");
       }
    }
}
