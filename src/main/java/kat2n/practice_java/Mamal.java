package main.java.kat2n.practice_java;

public class Mamal implements Animal2 {
  public void eat() {
    System.out.println("eat");
  }

  public void travel() {
    System.out.println("travel");
  }

  public void xxx() {
    System.out.println("xxx");
  }

  public static void main(String... args) {
    Animal2 mamal = new Mamal();
    mamal.eat();
    mamal.travel();
  }
}
