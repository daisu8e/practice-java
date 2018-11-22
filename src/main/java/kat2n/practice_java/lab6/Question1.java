package main.java.kat2n.practice_java.lab6;

import main.java.kat2n.practice_java.lab6.question1.SampleString;

public class Question1 {

  public static void main(String[] args) {
    SampleString sampleString = new SampleString("Long time years ago, there lived a man, his wife, his father, and his little son. His father loved his family a lot");
    sampleString.replace("father", "mother");
    sampleString.print();
  }
}
