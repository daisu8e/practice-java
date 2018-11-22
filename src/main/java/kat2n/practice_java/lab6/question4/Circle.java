package main.java.kat2n.practice_java.lab6.question4;

public class Circle extends Shape {

  public Circle(int radius) {
    this.x = radius;
  }

  public void printArea() {
    System.out.printf("Area of Circle: %.1f\n", this.x * this.x * Math.PI);
  }
}
