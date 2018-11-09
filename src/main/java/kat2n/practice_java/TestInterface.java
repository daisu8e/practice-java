package main.java.kat2n.practice_java;

public class TestInterface {
  public static void main(String... args) {
    Bank scotia = new Scotia();
    Bank tdBank = new TDBank();

    System.out.println("main.java.kat2n.practice_java.Scotia main.java.kat2n.practice_java.Bank's ROI : " + scotia.rateOfInterest());
    System.out.println("TD main.java.kat2n.practice_java.Bank's ROI : " + tdBank.rateOfInterest());
  }
}
