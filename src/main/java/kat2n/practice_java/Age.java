package main.java.kat2n.practice_java;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age.");
        int age = input.nextInt();
        String message = "";

        if (age > 70) {
            message = "You are too old to study Java.";
        } else if (age > 60) {
            message = "You still can study Java.";
        } else if (age > 50) {
            message = "You can be a master of Java.";
        } else if (age > 40) {
            message = "You can be an instructor of Java.";
        } else if (age > 20) {
            message = "Don't study, get married first.";
        } else {
            message = "Grow up more!";
        }

        System.out.println(message);

        input.close();
    }
}
