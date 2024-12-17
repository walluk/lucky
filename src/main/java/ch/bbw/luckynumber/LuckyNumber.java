package ch.bbw.luckynumber;

import java.util.*;

/**
 * LuckyNumber
 * Fachklasse für das Berechnen von Glueckszahlen
 *
 * @author Peter Rutschmann
 * @date 06.09.2021
 */
public class LuckyNumber {

    public int singleDice() {
        Random random = new Random();
        int value = random.nextInt(6) + 1; // Gibt eine Zufallszahl zwischen 1 und 6 zurück
        return value;
    }

    public List<Integer> doubleDice() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        list.add(random.nextInt(6) + 1); // Erster Würfeln
        list.add(random.nextInt(6) + 1); // Zweiter Würfeln
        return list;
    }

    public boolean trueOrFalse(){
        //Hier ergaenzen

        return false;
    }

    public Set<Integer> sixLottoNumbers(){
        Set<Integer> set = new HashSet<Integer>();
        //Hier ergaenzen

        return set;
    }

    public String playingCard(){
        //Hier ergaenzen

        return "keine Karte";
    }

    public List<Integer> primeUpTo100(){
        List<Integer> list = new ArrayList<>();
        //Hier ergaenzen

        return list;
    }

    public int primeNextTo(int value){
        //Hier ergaenzen

        return 0;
    }

    public List<Integer> triangleNumbersUpTo(int value){
        List<Integer> list = new ArrayList<Integer>();
        //Hier ergaenzen

        return list;
    }
}
