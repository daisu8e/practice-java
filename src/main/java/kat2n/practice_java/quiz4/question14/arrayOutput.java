package main.java.kat2n.practice_java.quiz4.question14;

class arrayOutput  {
  public static void main(String[] args){
    int arrayVariable[] = new int[10];
    for (int i = 0; i < 10; ++i){
      arrayVariable[i] = i;
      System.out.print(arrayVariable[i] + " ");
      i++;
    }
  }
}
