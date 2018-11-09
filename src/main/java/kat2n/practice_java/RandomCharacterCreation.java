package main.java.kat2n.practice_java;

public class RandomCharacterCreation {
  public static void main(String... args) {
    int n = (int)((int)'a' + Math.random() * ((int)'z' - (int)'a' + 1));
    char c = (char)('a' + Math.random() * ('z' - 'a' + 1));

    System.out.println(n);
    System.out.println((char)n);

    System.out.println(c);
    System.out.println((int)c);
  }
}
