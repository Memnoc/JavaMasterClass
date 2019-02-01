package GENERICS;

public class Main {

    public static void main(String[] args) {
        Universe7 goku = new Universe7("Goku");
        Universe7 vegeta = new Universe7("Vegeta");
        Universe7 frieza = new Universe7("Frieza");

        Universe6 kefla = new Universe6("Kefla");
        Universe6 hit = new Universe6("Hit");
        Universe6 cabba = new Universe6("Cabba");

        Universe11 jiren = new Universe11("Jiren");
        Universe11 toppo = new Universe11("Toppo");
        Universe11 dispo = new Universe11("Dispo");

        TournamentOfPower<Universe7> universe7 = new TournamentOfPower<>("Universe 7 - Team Goku");
        universe7.addWarrior(goku);
        universe7.addWarrior(vegeta);
        universe7.addWarrior(frieza);
        System.out.println("****************************************");

        TournamentOfPower<Universe6> universe6 = new TournamentOfPower<>("Universe 6 - Team Hit");
        universe6.addWarrior(kefla);
        universe6.addWarrior(hit);
        universe6.addWarrior(cabba);
        System.out.println("*****************************************");

        TournamentOfPower<Universe11> universe11 = new TournamentOfPower<>("Universe 11 - Team Toppo");
        universe11.addWarrior(jiren);
        universe11.addWarrior(toppo);
        universe11.addWarrior(dispo);
        System.out.println("******************************************");

        System.out.println(universe7.numWarriors());
        System.out.println(universe6.numWarriors());
        System.out.println(universe11.numWarriors());

    }
}
