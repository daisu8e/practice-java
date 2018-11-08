package main.java.kat2n.practice_java.lab2.question3;

import java.util.Scanner;

public class Lab2Question3DoSomethingMain {
  public static void main(String... args) {
    System.out.println("Tell me a string that has a decent length with some spaces inside");
    Scanner input = new Scanner(System.in);
    String string = input.nextLine();

    Lab2Question3DoSomething doSomething = new Lab2Question3DoSomething();
    System.out.println(string);
    System.out.println(doSomething.removeSpace(string));
  }
}
