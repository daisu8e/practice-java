package main.java.kat2n.practice_java;

import java.util.*;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " + al.size());

        al.add("A");
        al.add("C");
        al.add("F");
        al.add("B");
        al.add("G");
        al.add("Q");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " + al.size());

        System.out.println("Contents of al: " + al);

        al.remove("F");
        al.set(2, "M");
        System.out.println("Contents of al: " + al);

        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);

        al.clear();
        System.out.println("Contents of al: " + al);
    }
}
