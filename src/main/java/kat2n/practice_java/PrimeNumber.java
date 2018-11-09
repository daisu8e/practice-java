package main.java.kat2n.practice_java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Boolean isPrimeNumber = false;

        if (n != 1) {
            isPrimeNumber = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        if (isPrimeNumber) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
