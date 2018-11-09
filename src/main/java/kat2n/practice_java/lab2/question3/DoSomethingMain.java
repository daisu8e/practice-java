package main.java.kat2n.practice_java.lab2.question3;

import java.util.Scanner;

public class DoSomethingMain {
  public static void main(String... args) {
    System.out.println("Tell me a string that has a decent length with some spaces inside");
    Scanner input = new Scanner(System.in);
    String string = input.nextLine();

    DoSomething doSomething = new DoSomething();
    System.out.println(string);
    System.out.println(doSomething.removeSpace(string));
  }
}
