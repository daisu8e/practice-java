package main.java.kat2n.practice_java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int n  = input.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (result == 0) {
                result = i;
            } else {
                result = result * i;
            }
        }

        System.out.println(result);
    }
}
