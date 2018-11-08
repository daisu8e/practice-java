package main.java.kat2n.practice_java.lab2.question3;

public class Lab2Question3DoSomething {

  final String BLANK = " ";

  public String removeSpace(String s) {
    String result = "";

    while (true) {
      int i = s.indexOf(BLANK);
      if (i != -1) {
        result += s.substring(0, i);
        s = s.substring(i + 1);
      } else {
        result += s;
        break;
      }
    }

    return result;
  }
}
