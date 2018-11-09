package main.java.kat2n.practice_java;

public class ContainsTest {
    public static void main(String[] args) {
        String str = "Seoul is the capital city of Korea";
        if (str.contains("city")) {
            System.out.println("This string contains city");
        } else {
            System.out.println("Result not found");
        }
    }
}
