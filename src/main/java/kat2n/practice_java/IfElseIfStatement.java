package main.java.kat2n.practice_java;

import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);
        System.out.println("Tell me a number");

        x = input.nextInt();

        if (x == 10) {
           System.out.println("The value of x is 10");
        }
    }
}
