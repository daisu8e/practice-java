package main.java.kat2n.practice_java.lab5b.question4;

import java.util.Scanner;

public class User {

  private Scanner input;

  public User() {
    this.input = new Scanner(System.in);
  }

  public String talk() {
    System.out.print("You : ");
    return this.input.nextLine();
  }
}
