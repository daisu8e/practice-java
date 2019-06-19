package main.java.kat2n.practice_java.quiz5;

public class Question7 {

  public static void main(String[] args) {
    whatsIt(347);
  }

  public static void whatsIt(int n){
    if (n > 10)
      whatsIt(n / 10);
    System.out.print(n % 10);
  }
}
