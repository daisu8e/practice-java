package main.java.kat2n.practice_java; /**
 * @author Daisuke
 * @version 1.1
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Tell me a number");

        n = input.nextInt();

        if (n >= 0) {
           System.out.println(n);
        } else {
           System.out.println(n + " is a negative number");
        }

        input.close();

    }
}
