package main.java.kat2n.practice_java.lab5a;

import main.java.kat2n.practice_java.lab5a.question2.Vowels;

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    System.out.print("Input the sentence or word: ");

    Scanner input = new Scanner(System.in);
    Vowels vowels = new Vowels(input.nextLine());

    System.out.println("Number of vowels in the sentence or word: " + vowels.count());
  }
}
