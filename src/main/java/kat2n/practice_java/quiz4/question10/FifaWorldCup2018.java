package main.java.kat2n.practice_java.quiz4.question10;

import java.util.HashMap;
import java.util.ArrayList;

public class FifaWorldCup2018 {

  private HashMap<Integer, String> teams;

  public FifaWorldCup2018() {
    this.teams = new HashMap<>();
    this.teams.put(1, "Uruguay");
    this.teams.put(2, "Russia");
    this.teams.put(3, "Saudi Arabia");
    this.teams.put(4, "Egypt");
    this.teams.put(5, "Spain");
    this.teams.put(6, "Portugal");
    this.teams.put(7, "Iran");
    this.teams.put(8, "Morocco");
    this.teams.put(9, "France");
    this.teams.put(10, "Denmark");
    this.teams.put(11, "Peru");
    this.teams.put(12, "Australia");
    this.teams.put(13, "Croatia");
    this.teams.put(14, "Argentina");
    this.teams.put(15, "Nigeria");
    this.teams.put(16, "Iceland");
    this.teams.put(17, "Brazil");
    this.teams.put(18, "Switzerland");
    this.teams.put(19, "Serbia");
    this.teams.put(20, "Costa Rica");
    this.teams.put(21, "Sweden");
    this.teams.put(22, "Mexico");
    this.teams.put(23, "South Korea");
    this.teams.put(24, "Germany");
    this.teams.put(25, "Belgium");
    this.teams.put(26, "England");
    this.teams.put(27, "Tunisia");
    this.teams.put(28, "Panama");
    this.teams.put(29, "Colombia");
    this.teams.put(30, "Japan");
    this.teams.put(31, "Senegal");
    this.teams.put(32, "Poland");
  }

  public void showAllTeamsRandomly() {
    ArrayList<Integer> indexes = getRandomIndexes(1, this.teams.size());
    for (Integer index : indexes) {
      System.out.println(index + " : " + teams.get(index));
    }
    System.out.println();
  }

  public void showFourTeamsRandomly() {
    ArrayList<Integer> indexes = getRandomIndexes(1, this.teams.size());
    for (int i = 0; i < 4; i++) {
      Integer index = indexes.get(i);
      System.out.println(index + " : " + teams.get(index));
    }
    System.out.println();
  }

  private static ArrayList<Integer> getRandomIndexes(int start, int end) {
    ArrayList<Integer> indexes = new ArrayList<>();
    while (indexes.size() != end - start + 1) {
      int index = (int)(start + (Math.random() * (end - start + 1)));
      if (!indexes.contains(index)) indexes.add(index);
    }
    return indexes;
  }

  public static void main(String... args) {
    FifaWorldCup2018 fifa = new FifaWorldCup2018();
    fifa.showAllTeamsRandomly();
    fifa.showFourTeamsRandomly();
  }

}
