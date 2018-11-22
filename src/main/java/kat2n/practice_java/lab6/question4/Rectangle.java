package main.java.kat2n.practice_java.lab6.question4;

public class Rectangle extends Shape {

  public Rectangle(int length, int width) {
    this.x = length;
    this.y = width;
  }

  public void printArea() {
    System.out.printf("Area of Rectangle: %.1f\n", (double)(this.x * this.y));
  }
}
