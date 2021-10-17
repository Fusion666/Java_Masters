

public class Main {
    public static void main(String[] args) {
        BasketballTeam losAngelesLakers = new BasketballTeam("Los Angeles Lakers");
        BasketballTeam newYorkKnicks = new BasketballTeam("New York Knicks");
        BasketballTeam goldenStateWarriors = new BasketballTeam("Golden State Warriors");
        BasketballTeam bostonCeltics = new BasketballTeam("Boston Celtics");
        BasketballTeam cleveLandCavaliers = new BasketballTeam("Cleveland Cavaliers");
        BasketballTeam milwaukeeBucks = new BasketballTeam("Milwaukee Bucks");
        BasketballTeam miamiHeat = new BasketballTeam("Milwaukee Bucks");

        ListOfTeams<BasketballTeam> newListOfBasketBallTeams = new ListOfTeams<>();

        newListOfBasketBallTeams.addTeamToLeague(losAngelesLakers);
        newListOfBasketBallTeams.addTeamToLeague(newYorkKnicks);
        newListOfBasketBallTeams.addTeamToLeague(goldenStateWarriors);
        newListOfBasketBallTeams.addTeamToLeague(bostonCeltics);
        newListOfBasketBallTeams.addTeamToLeague(cleveLandCavaliers);
        newListOfBasketBallTeams.addTeamToLeague(milwaukeeBucks);
        newListOfBasketBallTeams.addTeamToLeague(milwaukeeBucks);

//        Collections.sort();
//        newListOfBasketBallTeams.addTeamToLeague(miamiHeat);

        newListOfBasketBallTeams.printInOrder();


    }
}
