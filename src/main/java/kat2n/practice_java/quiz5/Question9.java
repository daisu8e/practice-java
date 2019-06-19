package main.java.kat2n.practice_java.quiz5;

public class Question9 {

  public static void main(String[] args) {
//    int[][] mat = new int[2][3];
    int[][] mat = {
      {-1, -2, -6},
      {-2, -4, 5}
    };
    changeMatrix(mat);
    for (int[] m : mat) {
      for (int n : m) {
        System.out.print(n + " ");
      }
      System.out.println();
    }
  }

  public static void changeMatrix(int[][] mat){
    for (int r = 0; r < mat.length; r++)
      for (int c = 0; c < mat[r].length; c++)
        if (r == c)
          mat[r][c] = Math.abs(mat[r][c]);
  }
}
