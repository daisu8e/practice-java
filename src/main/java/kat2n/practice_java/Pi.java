package main.java.kat2n.practice_java;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number.");
        int number = input.nextInt();
        double pi = 0;

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                pi = pi + 4.0 / (i * 2 + 1);
            } else {
                pi = pi - 4.0 / (i * 2 + 1);
            }
        }

        System.out.println(pi);
    }
}
