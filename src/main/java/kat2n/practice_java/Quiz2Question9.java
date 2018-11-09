package main.java.kat2n.practice_java;

public class Quiz2Question9 {
  public static void main(String... args) {

    for (int i = 0; i < 10; i++) {
      char showCharacter = (char) ('a' + Math.random() * ('z' - 'a' + 1));
      System.out.print(showCharacter + " ");
    }

//    for (int i = 0; i < 10; i++) {
//      int showCharacter = (int) (‘a’+Math.random() * (‘z’ – ‘a’+1));
//      System.out.println(showCharacter);
//    }

//    for (int i = 0; i < 10; i++) {
//      String showCharacter = (String) (‘a’ + Math.random() * (‘z’ – ‘a’ +1));
//      System.out.println(showCharacter);
//    }

  }
}
