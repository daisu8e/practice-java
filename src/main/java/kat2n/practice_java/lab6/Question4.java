package main.java.kat2n.practice_java.lab6;

import main.java.kat2n.practice_java.lab6.question4.Rectangle;
import main.java.kat2n.practice_java.lab6.question4.Triangle;
import main.java.kat2n.practice_java.lab6.question4.Circle;

public class Question4 {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 2);
    Circle circle = new Circle(5);
    Triangle triangle = new Triangle(5, 3);

    rectangle.printArea();
    circle.printArea();
    triangle.printArea();
  }
}
