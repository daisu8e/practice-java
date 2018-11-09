package main.java.kat2n.practice_java;

import main.java.kat2n.practice_java.ACorporation;

public class ACorporationTest {
  public static void main(String... args) {
    ACorporation aCorporation = new ACorporation();

    aCorporation.pay("Employee1", 7.50,35);
    aCorporation.pay("Employee2", 8.20,47);
    aCorporation.pay("Employee3", 10.00, 73);
  }
}
