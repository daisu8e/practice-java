package main.java.kat2n.practice_java;

import java.util.*;

public class ArrayAndArray {
    public static void main(String[] args) {
        String[] test1 = {"AAA", "BBB", "CCC"};

        ArrayList<String> test2 = new ArrayList<String>();
        test2.add("AAA");
        test2.add("BBB");
        test2.add("CCC");

        System.out.println("test1 = " + test1);
        System.out.println("test2 = " + test2);

        String test3 = "test3";
        char[] test4 = test3.toCharArray();
        System.out.println(test3);
        System.out.println(test4[0]);
  }
}
