package main.java.kat2n.practice_java;

public class MyCalculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers: " + z);
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        MyCalculation calculation = new MyCalculation();
        calculation.addition(a, b);
        calculation.subtraction(a, b);
        calculation.multiplication(a, b);
    }
}
