package main.java.kat2n.practice_java.lab6;

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    System.out.print("Type a number: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt() - 1;
    for (int i = -number; i <= number; i++) {
      for (int j = -number; j <= number; j++) {
        int y = number - Math.abs(i) + 1;
        int x = Math.abs(j) + 1;
        if (x <= y) {
          System.out.print(x);
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
  }
}
