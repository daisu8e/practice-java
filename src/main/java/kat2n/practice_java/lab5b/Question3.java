package main.java.kat2n.practice_java.lab5b;

import java.util.Scanner;

import main.java.kat2n.practice_java.lab5b.question3.Order;

public class Question3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input first number: ");
    int firstNumber = input.nextInt();

    System.out.print("Input second number: ");
    int secondNumber = input.nextInt();

    System.out.print("Input third number: ");
    int thirdNumber = input.nextInt();

    Order order = new Order(firstNumber, secondNumber, thirdNumber);

    System.out.print("Expected Output: ");
    if (order.isIncreasing()) {
      System.out.print("Increasing order");

    } else if (order.isDecreasing()) {
      System.out.print("Decreasing order");

    } else {
      System.out.print("Neither increasing or decreasing order");

    }
  }
}
