package main.java.kat2n.practice_java.quiz5.question13;

public class ArrayOutput {
  public static void main(String args[]) {
    char arrayVariable [] = new char[10];
    for (int i = 0; i < 10; ++i) {
      arrayVariable[i] = 'I';
      System.out.print(arrayVariable[i] + " " );
      i++;
    }
  }
}
