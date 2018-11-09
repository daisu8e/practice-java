package main.java.kat2n.practice_java;

import java.util.Scanner;

public class ScannerTest {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);

    int[] array = new int[3];

    for (int i = 0; i < array.length; i++) {
      array[i] = input.nextInt();
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
