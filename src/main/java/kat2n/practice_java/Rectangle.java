package main.java.kat2n.practice_java;

public class Rectangle {
    int length;
    int width;

    void area(int length, int width) {
        int areaOfRectangle = length * width;
        System.out.println("Area of main.java.kat2n.practice_java.Rectangle : " + areaOfRectangle);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.length = 20;
        r1.width = 10;
        r2.area(r1.length, r1.width);
    }
}
