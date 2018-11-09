package main.java.kat2n.practice_java;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        String grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me your grade");

        grade = input.nextLine().toUpperCase();

        if (grade.equals("A")) {
            System.out.println("Excellent");
        } else if (grade.equals("B")) {
            System.out.println("Good");
        } else if (grade.equals("C") || grade.equals("D")) {
            System.out.println("Poor");
        } else if (grade.equals("F")) {
            System.out.println("Go Home");
        } else {
            System.out.println("Invalid Grade");
        }

        input.close();
    }
}
