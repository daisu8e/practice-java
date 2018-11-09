package main.java.kat2n.practice_java;

public class Sorter {
  private Integer[] a;

  public Sorter(Integer[] arr){
    a = arr;
  }

  private void swap(int i, int j) {
    /* implementation not shown */
  }

  public void selectionSort() {
    for (int i = 0; i < a.length - 1; i++) {
      Integer max = a[i];
      int maxPos = i;
      for (int j = i + 1; j < a.length; j++) {
        if (max.compareTo(a[j]) < 0) {
          max = a[j];
          maxPos = j;
        }
        swap(i, maxPos);
      }
    }
  }
}
