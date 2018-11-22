package main.java.kat2n.practice_java.lab6;

import java.util.ArrayList;

public class Question3 {
  public static void main(String[] args) {

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    addRow(list);

    for (int i = 4; i < 200; i++) {
      if (!isPrime(i)) continue;
      ArrayList<Integer> row = getLastRow(list);
      if (row.size() == 2) {
        addRow(list);
        row = getLastRow(list);
      }
      row.add(i);
    }

    for (int i = 0; i < list.size(); i++) {
      ArrayList<Integer> row = list.get(i);
      System.out.printf("<%d, %d>\n", row.get(0), row.get(1));
    }
  }

  public static boolean isPrime(int number) {
    boolean isPrimeNumber = true;
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        isPrimeNumber = false;
        break;
      }
    }
    return isPrimeNumber;
  }

  public static void addRow(ArrayList<ArrayList<Integer>> list) {
    ArrayList<Integer> row = new ArrayList<>();
    list.add(row);
  }

  public static ArrayList<Integer> getLastRow(ArrayList<ArrayList<Integer>> list) {
    return list.get(list.size() - 1);
  }
}
