package main.java.kat2n.practice_java;

import java.util.ArrayList;
public class AddArrayList {
    public static void main(String[] args) {

        //ArrayList<String> Declaration
        ArrayList<String> arrayList1 = new ArrayList<String>();
        //add method for String ArrayList
        arrayList1.add("Eric");
        arrayList1.add("Shimba");
        arrayList1.add("Dai");
        arrayList1.add("Hiroaki");
        arrayList1.add("Noriaki");
        System.out.println("Elements of ArrayList of String Type: " + arrayList1);

        //ArrayList<Integer> Declaration
        ArrayList<Integer> arrayList2 = new ArrayList < Integer > ();
        //add method for integer ArrayList
        arrayList2.add(1);
        arrayList2.add(34);
        arrayList2.add(99);
        arrayList2.add(99);
        arrayList2.add(78);
        System.out.println("Elements of ArrayList of Integer Type: " + arrayList2);
    }
}
