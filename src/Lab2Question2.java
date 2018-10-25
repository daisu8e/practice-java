import java.util.Scanner;

public class Lab2Question2 {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    double average;

    System.out.println("Enter number of subjects");
    int subjects = input.nextInt();

    System.out.println("Enter marks");
    int[] marks = new int[subjects];
    for (int i = 0; i < marks.length; i++) {
      marks[i] = input.nextInt();
      sum += marks[i];
    }
    average = (double)(sum) / subjects;

    System.out.print("Average of (");
    for (int i = 0; i < marks.length; i++) {
      System.out.print(marks[i]);
      if (i != marks.length - 1) System.out.print(", ");
    }
    System.out.print(") = ");
    System.out.printf("%.1f", average);
  }
}
