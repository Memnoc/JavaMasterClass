package GENERICS;

import java.util.ArrayList;

public class TournamentOfPower<T extends Warrior> {
    private String teamName;
    int fight = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public TournamentOfPower(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addWarrior(T warrior) {
        if(members.contains(warrior)) {
            System.out.println(warrior.getName() + " is already on the Team");
            return false;
        } else {
            members.add(warrior);
            System.out.println(warrior.getName() + " picked for " + this.teamName);
            return true;
        }
    }
    public int numWarriors() {
        return this.members.size();
    }

    public void matchResult(TournamentOfPower opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        fight++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
