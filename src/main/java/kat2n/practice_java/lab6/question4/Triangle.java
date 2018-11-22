package main.java.kat2n.practice_java.lab6.question4;

public class Triangle extends Shape {

  public Triangle(int base, int height) {
    this.x = base;
    this.y = height;
  }

  public void printArea() {
    System.out.printf("Area of Triangle: %.1f\n", this.x * this.y / 2.0);
  }
}
