package main.java.kat2n.practice_java.quiz5;

import main.java.kat2n.practice_java.quiz5.question8.Vowels;

import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    System.out.print("Input the sentence or word: ");

    Scanner input = new Scanner(System.in);
    Vowels vowels = new Vowels(input.nextLine());

    System.out.println("Number of vowels in the sentence or word: " + vowels.count());
  }
}
