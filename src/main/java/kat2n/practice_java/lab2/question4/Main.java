package main.java.kat2n.practice_java.lab2.question4;

import java.util.Scanner;

public class Lab2Question4Main {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter two people's names");
    String name1 = input.nextLine();
    String name2 = input.nextLine();

    Lab2Question4Name person1 = new Lab2Question4Name(name1.substring(0, name1.indexOf(" ")), name1.substring(name1.indexOf(" ") + 1));
    Lab2Question4Name person2 = new Lab2Question4Name(name2.substring(0, name2.indexOf(" ")), name2.substring(name2.indexOf(" ") + 1));

    System.out.println(person1.compareTo(person2));

    if (person1.compareTo(person2) <= 0) {
      System.out.println(person1.toString() + "\n" + person2.toString());
    } else {
      System.out.println(person2.toString() + "\n" + person1.toString());
    }
  }
}
