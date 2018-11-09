package main.java.kat2n.practice_java;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("the area is %.3f\n", area);
        System.out.printf("the perimeter is %.3f\n", perimeter);
    }
}
