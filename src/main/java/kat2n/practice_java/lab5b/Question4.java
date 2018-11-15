package main.java.kat2n.practice_java.lab5b;

import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    System.out.println("Hello, let's talk.");

    Scanner input = new Scanner(System.in);

    while (true) {
      String comment = input.nextLine();

      if (comment.equals("")) {
        System.out.println("Say something, please");
      } else if (comment.equals("Bye")) {
        System.exit(0);
      }
    }

  }
}
