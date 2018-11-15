package main.java.kat2n.practice_java.lab5b.question3;

public class Order {

  private int firstNumber;
  private int secondNumber;
  private int thirdNumber;

  public Order(int firstNumber, int secondNumber, int thirdNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.thirdNumber = thirdNumber;
  }

  public boolean isIncreasing() {
    return firstNumber < secondNumber && secondNumber < thirdNumber;
  }

  public boolean isDecreasing() {
    return thirdNumber < secondNumber && secondNumber < firstNumber;
  }
}
