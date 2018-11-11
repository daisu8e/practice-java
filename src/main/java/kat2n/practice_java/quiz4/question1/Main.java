package main.java.kat2n.practice_java.quiz4.question1;

public class Main {
  public static void main(String... args) {
    int num = 47;
    if (num > 0)
      if (num % 5 == 0)
        System.out.println(num);
      else
        System.out.println(num + " is negative");
  }
}
