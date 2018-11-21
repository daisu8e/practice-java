package main.java.kat2n.practice_java;

public class FactorialRecursion {
  static int factorial(int n) {
    if (n == 0)
      return 1;
    else
      return n * factorial(n - 1); // recursive call
  }

  public static void main(String[] args) {
    int number = 4, result;
    result = factorial(number);
    System.out.println(number + " factorial = " + result);
  }
}
