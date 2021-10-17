import java.util.ArrayList;

public class ListOfTeams<Team extends AbstractTeam> implements ITable {
    private String name;

    public boolean addTeamToLeague(Team team) {
        if (teamsOfSameType.contains(team)) {
            System.out.println(team.getName() + " is ALREADY in the list of teams. Item NOT added!!!");
            return false;
        } else {
            teamsOfSameType.add(team);
            System.out.println(team.getName() + " is added to the list of teams");
            return true;
        }
    }

    @Override
    public void sort() {
//        Collections.sort(ArrayList<Team> teamsOfSameType ); // not working - Have to research how collection.sort works
    }

    @Override
    public void printInOrder() {
        for (AbstractTeam team: teamsOfSameType) {
            System.out.println(team.getName());
        }
    }

    private ArrayList<Team> teamsOfSameType = new ArrayList<>();

}
