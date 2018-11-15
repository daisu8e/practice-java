package main.java.kat2n.practice_java.lab5a.question1;

public class Password {

  private String value;

  private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String DIGITS = "0123456789";

  public Password(String value) {
    this.value = value;
  }

  public boolean isValid() {
    if (!this.hasAtLeastEightCharacters()) return false;
    if (!this.hasOnlyLettersAndDigits()) return false;
    if (!this.hasAtLeastTwoDigits()) return false;
    return true;
  }

  public String toString() {
    return this.value;
  }

  private boolean hasAtLeastEightCharacters() {
    return this.value.length() >= 8;
  }

  private boolean hasOnlyLettersAndDigits() {
    for (int i = 0; i < this.value.length(); i++) {
      if (LETTERS.indexOf(this.value.charAt(i)) == -1 && DIGITS.indexOf(this.value.charAt(i)) == -1) return false;
    }
    return true;
  }

  private boolean hasAtLeastTwoDigits() {
    int digitsNumber = 0;
    for (int i = 0; i < this.value.length(); i++) {
      if (DIGITS.indexOf(this.value.charAt(i)) >= 0) digitsNumber++;
      if (digitsNumber >= 2) return true;
    }
    return false;
  }
}
