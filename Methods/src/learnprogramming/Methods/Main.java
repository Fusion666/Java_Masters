package learnprogramming.Methods;

public class Main {

    public static void main(String[] args) {
        String playerName = "Victor";
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + highScore);

        highScore = calculateScore(true, 10_000, 8, 200);
        System.out.println("Your final score was: " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("David", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Lilia", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bill", highScorePosition);
        }

        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
// since we have our parameters defined in our method we don't have to defined them in our code block AT ALL!!!
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1_000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition (String playerName, int highScorePosition) {
        System.out.println(playerName+ " ,you managed to get to: " + highScorePosition + " position.");
    }


    public static int calculateHighScorePosition (int playerScore){
        if (playerScore >= 1_000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}

