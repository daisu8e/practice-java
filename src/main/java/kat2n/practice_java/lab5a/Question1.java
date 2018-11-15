package main.java.kat2n.practice_java.lab5a;

import main.java.kat2n.practice_java.lab5a.question1.Password;

import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    System.out.println("1. A password must have at least eight characters.");
    System.out.println("2. A password consists of only letters and digits.");
    System.out.println("3. A password must contain at least two digits.");
    System.out.println();
    System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");

    Scanner input = new Scanner(System.in);
    Password password = new Password(input.nextLine());

    if (password.isValid()) System.out.println("Password is valid: " + password);
    else System.out.println("Not a valid password: " + password);
  }
}
