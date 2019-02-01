package GENERICS;

public class Main {

    public static void main(String[] args) {
        Universe7 goku = new Universe7("Goku");
        Universe6 kefla = new Universe6("Kefla");
        Universe11 jiren = new Universe11("Jiren");

        TournamentOfPower universe7 = new TournamentOfPower("Universe 7 - Team Goku");
        universe7.addWarrior(goku);
        universe7.addWarrior(kefla);
        universe7.addWarrior(jiren);

        System.out.println(universe7.numWarriors());

    }
}
