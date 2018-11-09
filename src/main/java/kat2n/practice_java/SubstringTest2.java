package main.java.kat2n.practice_java;

public class SubstringTest2 {
    public static void main(String[] args) {
        String str = "This is Java Computer Science A Lab";
        String substr = "";
        substr = str.substring(7, 21);
        System.out.println("substring = " + substr);
        substr = str.substring(0, 7);
        System.out.println("substring = " + substr);
    }
}
