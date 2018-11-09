package main.java.kat2n.practice_java;

import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {
    int number = (int)(Math.random() * 101);

    System.out.println("Guess a magic number between 0 and 100");
    System.out.print("\nEnter your guess: ");
    Scanner input = new Scanner(System.in);
    int guess = input.nextInt();
    input.close();

    System.out.println("The original number is: " + number);
    if (guess == number) System.out.println("Yes, the number is " + number);
    else if (guess > number) System.out.println("Your guess is too high");
    else System.out.println("Your guess is too low");
  }
}
