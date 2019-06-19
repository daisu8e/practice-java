package main.java.kat2n.practice_java.quiz5.question8;

public class Vowels {

  private String sentence;

  private static final String VOWELS = "aeiouAEIOU";

  public Vowels(String sentence) {
    this.sentence = sentence;
  }

  public int count() {
    int number = 0;
    for (int i = 0; i < this.sentence.length(); i++) {
      if (VOWELS.indexOf(this.sentence.charAt(i)) >= 0) number++;
    }
    return number;
  }
}
