package main.java.kat2n.practice_java.lab4b.question2;

public class ArrayComparison {
  public static void main(String... args) {
    int[] a = {1, 2, 5, 5, 8, 9, 7, 10, 12, 14};
    int[] b = {1, 0, 6, 15, 6, 4, 7, 0, 12, 15};

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) System.out.println(a[i]);
      }
    }
  }
}
