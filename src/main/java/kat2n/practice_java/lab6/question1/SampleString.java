package main.java.kat2n.practice_java.lab6.question1;

public class SampleString {

  private String value;

  public SampleString(String value) {
    this.value = value;
  }

  public void replace(String a, String b) {
    this.value = this.value.replace(a, b);
  }

  public void print() {
    System.out.println(this.value);
  }
}
