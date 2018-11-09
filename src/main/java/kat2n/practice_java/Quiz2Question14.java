package main.java.kat2n.practice_java;

public class Quiz2Question14 {

  public static void main(String... args) {
    int[] arr = {1, 2, 3, 4};

    doSomething(arr);
    System.out.print(arr[1] + " ");
    System.out.print(arr[3]);
  }

  public static void doSomething(int[] list){
    int[] b = list;
    for (int i = 0; i < b.length; i++)
      b[i] = i;
  }

}
