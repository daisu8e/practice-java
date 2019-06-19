package main.java.kat2n.practice_java.quiz5.question5_6;

public class Tester {

  private int[] testArray = {3, 4, 5};

  public void increment (int n){
    n++;
  }

  public void firstTestMethod(){
    for (int i = 0; i < testArray.length; i++){
      increment(testArray[i]);
      System.out.print(testArray[i] + " ");
    }
  }

  public void secondTestMethod(){
    for (int element : testArray){
      increment(element);
      System.out.print(element + " ");
    }
  }
}
